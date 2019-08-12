package gaja.project.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import gaja.project.domain.CartVO;
import gaja.project.domain.Criteria;
import gaja.project.domain.MemberVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.PageCri;
import gaja.project.domain.PageMaker;
import gaja.project.domain.SelectVO;
import gaja.project.domain.pageing;
import gaja.project.service.MemberService;


//회원가입 및 로그인에 관련되있는 컨트롤러 클래스 

@Controller
public class MemberController {
	
	@Inject
	MemberService Mservice;

	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String Login() {   //로그인 페이지로 이통하는 컨트롤러 (최시준)
	
	
		
		return "/Account/Login";
	}
	
	
	
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Locale locale) {  //회원가입 페이지로 이동하는 컨트롤러(최시준)
	
	
		
		return "/Account/Join";
	}
	
	
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberVO vo,RedirectAttributes rttr) throws Exception {
	
		
		int result = Mservice.join(vo);  //회원가입 정보 insert하는 컨트롤러(최시준)
		
		
		
		if(result == 1)
		{
		rttr.addFlashAttribute("msg", "success");
	
		
		}
		
		else {
			rttr.addFlashAttribute("msg", "false");
			
		}
		
		
		return "redirect:/login";
	}
	
	
	
	
	@RequestMapping(value = "/idchecked", method = RequestMethod.GET)
	@ResponseBody
	public String Idcheck(String id) throws Exception {  //아이디 중복체크 (최시준)
	
	
	
		return Mservice.idCheckd(id);
	}
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)  // 로그인 컨트롤러(최시준)
	public String Login(MemberVO vo,Model model) throws Exception {
	
		
		String result = Mservice.login(vo);
		
		
		
		if(result == null || result =="")
		{
		
			String msg2 = "아이디나 비밀번호를 확인하여주세요";
			
			model.addAttribute("msg2", msg2);
	    
	     
		return "Login";
		
		
		}
		
		else {
		
			model.addAttribute("id",result);
			
			return "redirect:/main";
			
		}
		
		
		
	}
	
	

	  @RequestMapping("logout")  // 로그아웃할시 세션 아웃 하는 컨트롤러(최시준)
	    public String logout(HttpSession session) {
	        session.setAttribute("id", null);
	        session.invalidate();
	        return "redirect:/main";
	    }
	
	

	  

		@RequestMapping(value = "/memberinfo", method = RequestMethod.GET)  //회원정보를 가져오는 컨트롤러
		public String memberinfo(pageing page,Model model) throws Exception {
			
			
			model.addAttribute("memberall",Mservice.memberall(page));
			
			PageCri pagecri = new PageCri();
			pagecri.setPage(page);
			pagecri.setTotalCount(Mservice.memberCountCriteria(page));
	
			model.addAttribute("pagecri" , pagecri); // 하단 페이징 데이터 
			
			
			
			return "/Account/userinfo";
		}
		
		
		
		
		@RequestMapping(value = "/orderlist", method = RequestMethod.GET)
		public String orderlist(pageing page,Model model) throws Exception {  //회원주문 리스트를 어드민이 가져오는 컨트롤러
		
		
			model.addAttribute("orderlist",Mservice.orderlist(page));
			
			PageCri pagecri = new PageCri();
			pagecri.setPage(page);
			pagecri.setTotalCount(Mservice.listCountCriteria(page));
	
			model.addAttribute("pagecri", pagecri);
				
			return "orderlist";
		}
		
		
		
		
		@RequestMapping(value = "/inorder", method = RequestMethod.GET)
		public String inorder(Model model,HttpSession session) throws Exception { //개개인이 주문내역을 확인할수있는 컨트롤러
		
			
			String id = (String)session.getAttribute("id");
			
			MemberVO mo = Mservice.orderinfo(id);
		
			int mnum = mo.getMnum();
			
			
			
			
			List<SelectVO> list = Mservice.inorder(mnum);
			
	
			
			model.addAttribute("inorder",list);
			
			
			
			return "inorder";
		}
		
		
		
		
		@RequestMapping(value = "/mypage", method = RequestMethod.GET)  //장바구니 담기 컨트롤러(최시준)
		public String mypage(HttpSession session,Model model) throws Exception {
			
			String id = (String)session.getAttribute("id");
			MemberVO mo = Mservice.orderinfo(id);
			model.addAttribute("mypage",mo);
		 	 
			
			return "/Account/mypage";		
		}	
		
		
		
		
		@RequestMapping(value = "/mypageup", method = RequestMethod.POST)  //마이페이지 수정 컨트롤러
		public String mypageup(MemberVO mo) throws Exception {
			
		
		  Mservice.myupdate(mo);

		
			
		
			
		 	 return "main";
			
		}	
	

}
