package gaja.project.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import gaja.project.domain.ShopVO;
import gaja.project.domain.CartVO;
import gaja.project.domain.MemberVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.OrderVO;
import gaja.project.domain.SelectVO;
import gaja.project.service.MemberService;
import gaja.project.service.ShopService;


// 쇼핑몰 메인기능에 관한 컨트롤ㄹ러 클래스

@Controller
public class MainController {
	 
	
	@Inject
	ShopService shops;  //SHOP 서비스 객체를 주입 
	
	@Inject
	MemberService Mservice; // MEMBER 서비스 객체를 주입
	
	

	@Resource(name = "uploadPath")
	private String uploadPath;  // 이미지 업로드 경로 빈으로 성정
	
	@Resource(name = "attachPath")
	private String attachPath;  // 접근 경로 빈으로 설정
	

	
		
	@RequestMapping(value = "/main", method = RequestMethod.GET)  //메인페이지로 이동하는 컨트롤러
	public void main() {
		

	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)  //상품리스트 
	public String toplist(ShopVO vo,Model model,RedirectAttributes rttr) throws Exception {
		
	
		model.addAttribute("shoplist",shops.shoplist(attachPath,vo));  // 모델에 list값을 넣어 뷰페이지로 전달
		
	
			if(shops.shoplist(attachPath,vo).size() == 0) {   // 리스트값이 0일경우 메세지와 함께 리다이렉트	
			rttr.addFlashAttribute("result", "등록된 제품이 없습니다.");
			return "redirect:/main";	
			}
		
	 	
		return "list";
	}
	
	

	
	
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)  // 상품 세부페이지로 가는  컨트롤러(최시준)
	public String productdetail(ShopVO vo,Model model) throws Exception {
		

		ShopVO detail = shops.ProductDetail(attachPath,vo);  
		
		model.addAttribute("productdetail",detail);
			 	
		return "ProductDetail";
	}

	
	
	@RequestMapping(value = "/search", method = RequestMethod.GET) // 카테고리별로 검색결과를 가져오는 컨트롤러(최시준)
	public String searchlist(@RequestParam("keyword") String keyword,@RequestParam("cate") String cate,Model model,RedirectAttributes rttr) throws Exception{
		
		HashMap<String, String> params = new HashMap<String, String>();  //키워드와 검색정보를 담기위해 맵으로 받음(mybatis에서 2개의 인자를 받기위해서)		
		params.put("keyword", keyword);
		params.put("cate",cate);
	    List<ShopVO> list = shops.shopsearch(params,attachPath);
	    
	    model.addAttribute("shoplist",list);
 	
		return "list";
	}	
	

	@RequestMapping(value = "/oneorder", method = RequestMethod.POST) //하나 주문할때 주문페이지 이동(최시준)
	public String order(SelectVO vo,Model model1,Model model2,HttpSession session) throws Exception {
		
		
		String id = (String)session.getAttribute("id");
			
		MemberVO mo = Mservice.orderinfo(id);
	
		model1.addAttribute("order",vo);  //주문하는 상품정보
		model2.addAttribute("orderinfo",mo);  // 주문하는 회원의 정보
		
		return "order";
	}	
	
	
	
	
	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public String ordesr(OrderVO vo,RedirectAttributes rttr) throws Exception {  //주문메소드(최시준)
		
	    
		String order = "one";
	
		int check = shops.insertOrder(vo,order);  //업데이트값을 체크하여 1일시 성공값 0일시실패값 전송
	
		if(check==1)
		{
			
			rttr.addFlashAttribute("result", "주문에 성공하셨습니다");
			
		} else {
			
			rttr.addFlashAttribute("result", "주문에 실패하셨씁니다.");
			
			
		}
	 	
		return "redirect:/inorder";
	}	
	
	
	@RequestMapping(value = "/cart", method = RequestMethod.POST)  //장바구니 담기(최시준)
	public String cart(CartVO vo,HttpSession session,RedirectAttributes rttr) throws Exception {
		

		String id = (String)session.getAttribute("id");
		
		MemberVO mo = Mservice.orderinfo(id);
		
		vo.setMnum(mo.getMnum());
		
		int check = shops.insertCart(vo);  //업데이트값을 체크하여 1일시 성공값 0일시실패값 전송
		
		
		if(check==1)
		{
			
			rttr.addFlashAttribute("result", "장바구니에 추가됬습니다.");
			
		} else {
			
			rttr.addFlashAttribute("result", "장바구니에 담기지 않았습니다.");
			
			
		}
		
	 	
		return "redirect:/detail?snum="+vo.getSnum();
	}	
	
	
	@RequestMapping(value = "/cartorder", method = RequestMethod.POST)
	public String cartorder(OrderVO vo,RedirectAttributes rttr) throws Exception {  //주문메소드(최시준)
		
	    String order = "cart";

		int check = shops.insertOrder(vo,order);
	
		
		if(check==1)
		{
			
			rttr.addFlashAttribute("result", "주문에 성공하셨습니다");
			
		} else {
			
			rttr.addFlashAttribute("result", "주문에 실패하셨씁니다.");
			
			
		}
	 	
		return "redirect:/inorder";
	}
	
	
	
	
	
	@RequestMapping(value = "/cartlist", method = RequestMethod.GET)  //장바구니 담기(최시준)
	public String cartorder(Model model,Model model2,HttpSession session) throws Exception {
		
	
		String id = (String)session.getAttribute("id");
		MemberVO mo = Mservice.orderinfo(id);
		
		int mnum = mo.getMnum();
			
		
		List<CartVO> list = shops.cartlist(attachPath,mnum);

		
		model.addAttribute("orderlist", list);
		model2.addAttribute("orderinfo", mo);
			
	 	 return "cartorder";
		
	}	
	
	
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public void upload() throws Exception {  //주문메소드 (최시준)
		

	}
	
	
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)  //업로드 페이지(최시준)
	public String uploadpro(@RequestParam MultipartFile mainimage2,@RequestParam MultipartFile subimage2,MultipartHttpServletRequest req,ShopVO shopvo) throws Exception {  
		
		
	   String mainname = uploadFile(mainimage2.getOriginalFilename(),mainimage2.getBytes());   	  
	   String subname = uploadFile(subimage2.getOriginalFilename(),subimage2.getBytes());   
	    
	     
	   
	   shopvo.setSname(req.getParameter("sname"));
	   shopvo.setPrice(req.getParameter("price"));
	   shopvo.setCate(req.getParameter("cate"));
	   shopvo.setColor(req.getParameter("color"));  //multi 타입 파라미터를 받기위함 (최시준)
	   shopvo.setSize(req.getParameter("size"));
	   shopvo.setScontent(req.getParameter("scontent"));
	   shopvo.setAmount(Integer.parseInt(req.getParameter("amount")));
	   shopvo.setMainimage(mainname);
	   shopvo.setSubimage(subname);
	    
	    // 여기까지 파일 목록 받기

	      
	       shops.insertshop(shopvo);

	    //메서드 실행
	   
	    
		 	
		return "upload";
	}
	
	
	private String uploadFile(String originalName, byte[] fileData) throws Exception {  //업로드 처리하는 메소드
		
		
		UUID uid = UUID.randomUUID();
		
		String saveName = uid.toString() + "_" + originalName;
		
		 File target= new File(uploadPath,saveName);
		 
		 FileCopyUtils.copy(fileData, target);

		return saveName;
		
	}
	
	

	
	@RequestMapping(value = "/delivery", method = RequestMethod.GET)
	public String delivery(OrderInfoVO vo) throws Exception {  //배송 체크를 하는 메소드 (최시준)
		
       shops.delivery(vo);
       
      return "redirect:/orderlist";
	}
	
	
	
	
	
	@RequestMapping(value = "/cartdelete", method = RequestMethod.GET)
	public String cartdelete(HttpSession session,RedirectAttributes rttr) throws Exception {  //장바구니 비우기 (최시준)
			
		String id = (String)session.getAttribute("id");
			
		MemberVO mo = Mservice.orderinfo(id);
			
		
		int check = shops.cartdelete(mo.getMnum());
      
	
		if(check == 1 ) {
			
			rttr.addFlashAttribute("result", "장바구니를 비웠습니다.");
		
			
		} else {
			
			rttr.addFlashAttribute("result", "장바구니를 비웠습니다.");

						
		}
		
			 	
      return "redirect:/cartlist";
	}

	
	
	
	
	@RequestMapping(value = "/shopdelete", method = RequestMethod.GET)
	public String shopdelete(SelectVO vo,RedirectAttributes rttr) throws Exception {  //상품 제거하는 메소드(최시준)
				
    
	int check = shops.shopdelete(vo.getSnum());
      
    if(check == 1) {
    	
    	
    	rttr.addFlashAttribute("result", "삭제 되었습니다.");  //삭제 유무에따라 임시메세지 전송
    } else {
    	
    	
    	rttr.addFlashAttribute("result", "삭제에 실패하였습니다.");
    	
    }
	
	 	
      return "redirect:/main"; 
	}
	
	
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String productupdate(ShopVO vo,Model model) throws Exception {
		

		int num = vo.getSnum();
		ShopVO detail = shops.ProductDetail(attachPath,vo);
		detail.setSnum(num);
			
		
		model.addAttribute("productdetail",detail);
		
	 	
		return "update";
	}
	
	
	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)  // 제품수정을 처리하는 컨트롤러
	public String productupdateproc(@RequestParam MultipartFile mainimage2,@RequestParam MultipartFile subimage2,MultipartHttpServletRequest req,HttpServletRequest request,RedirectAttributes rttr,ShopVO shopvo) throws Exception {
	
			 
		 String mainname = uploadFile(mainimage2.getOriginalFilename(),mainimage2.getBytes());   	  
		 String subname = uploadFile(subimage2.getOriginalFilename(),subimage2.getBytes());   
		 	 
		   
		    shopvo.setSname(req.getParameter("sname"));
		    shopvo.setPrice(req.getParameter("price"));
		    shopvo.setCate(req.getParameter("cate"));
		    shopvo.setColor(req.getParameter("color"));
		    shopvo.setSize(req.getParameter("size"));
		    shopvo.setScontent(req.getParameter("scontent"));
		    shopvo.setAmount(Integer.parseInt(req.getParameter("amount")));
		    shopvo.setMainimage(mainname);
		    shopvo.setSubimage(subname);
		    shopvo.setSnum(Integer.parseInt(req.getParameter("snum")));
    
		    // 여기까지 파일 목록 받기 멀티파트 객체라 이렇게 받아주야한다.
		   	
		       int check = shops.shopupdate(shopvo);
		  		       
		       if(check == 1) {
		       	
		       	
		       	rttr.addFlashAttribute("result", "수정 되었습니다.");
		       } else {
		       	
		       	
		       	rttr.addFlashAttribute("result", "수정에 실패하였습니다.");
		       	
		       }
		         
	 	
		return "redirect:/main";
	}
	
	
	
	
}
