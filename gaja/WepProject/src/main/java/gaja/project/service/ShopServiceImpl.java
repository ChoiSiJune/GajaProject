package gaja.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import gaja.project.controller.MainController;
import gaja.project.domain.CartVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.OrderVO;
import gaja.project.domain.SelectVO;
import gaja.project.domain.ShopVO;
import gaja.project.persistence.ShopDAO;


@Service
public class ShopServiceImpl implements ShopService {
	
	@Inject
	private ShopDAO dao;
	
	  

    
	@Override
	public List<ShopVO> shoplist(String path,ShopVO vo) throws Exception {
	
		
		
	List<ShopVO> data = new ArrayList<ShopVO>();
		
		data = dao.shoplist(vo) ;
		
	 for(int i=0; i<data.size();i++) {   //강 이미지당 경로를 넣어준다.
		 
		 
		 data.get(i).setMainimage(path+data.get(i).getMainimage()); 
		 
	
	 }
		
		
	
		return data;
		
	}

	@Override
	public ShopVO ProductDetail(String path,ShopVO vo) throws Exception {
		
		ShopVO data = dao.shopdetail(vo);
		data.setMainimage(path+data.getMainimage()); // 접근경로 설정
		data.setSubimage(path+data.getSubimage());
		
		System.out.println(data.getMainimage());
		System.out.println(data.getSubimage());

		
		return data;
	}

	@Override
	public List<ShopVO> shopsearch(HashMap params,String path) throws Exception {
		
		
		List<ShopVO> data = new ArrayList<ShopVO>();
		
		data = dao.shopsearch(params);
		
	 for(int i=0; i<data.size();i++) {   //강 이미지당 경로를 넣어준다.
		 
		 
		 data.get(i).setMainimage(path+data.get(i).getMainimage()); 
		 
	
	 }
		
		
	
		return data;
		
		
	}

	@Override
	public int insertOrder(OrderVO vo,String order) throws Exception {
		
		
		SelectVO svo = new SelectVO();

	    String[] name = vo.getSname();
	    String[] address = vo.getAddress();
	    String[] color = vo.getColor();
	    String[] message = vo.getMessage();
	    String[] ocount = vo.getOcount();
	    String[] phone = vo.getPhone();
	    String[] price = vo.getPrice();
	    String[] size = vo.getSize();
	    int[] snum = vo.getSnum();
	    int[] mnum = vo.getMnum();

	    
	    int check = 0;
	    int delete = 0;
	    
	    for(int i=0; i<name.length;i++)
	    {
	    	

	
	    	svo.setSname(name[i]);
	    	svo.setAddress(address[i]);
	    	svo.setColor(color[i]);
	    	svo.setMessage(message[i]);
	    	svo.setMnum(mnum[i]);
	    	svo.setOcount(ocount[i]);
	    	svo.setPhone(phone[i]);
	    	svo.setPrice(price[i]);
	    	svo.setSize(size[i]);
	    	svo.setSnum(snum[i]);
	    	
	    	
	    	
	    	
	    	delete = dao.amountdown(svo);
	    	
	    	
	    	if(delete == 0) {
	    		
	    		break;
	    	}
	    	
	    	check = dao.insertOrder(svo);
	    	
	    		    	
	    }
	    
	   
	    
	    if(order.equals("cart")) {
	    	
	    	dao.deletecart(mnum[0]);
	    	
	    }
		
			
		return check; 
	}

	@Override
	
	public int insertCart(CartVO vo) throws Exception {
	
		return dao.insertCart(vo);
	}

	@Override
	public List<CartVO> cartlist(String path,int mnum) throws Exception {
		
		List<CartVO> list = dao.cartlist(mnum);
		

		 
		 
		return list;
	}

	@Override
	public int insertshop(ShopVO vo) throws Exception {
	
		return dao.insertShop(vo);
	}

	@Override
	public void delivery(OrderInfoVO vo) throws Exception {

		dao.delivery(vo);
	}

	@Override
	public int cartdelete(int mnum) throws Exception {
	
		return dao.cartdelete(mnum);
	}

	
	@Override
	public int shopdelete(int snum) throws Exception {
		
		
		return dao.shopdelete(snum);
	}

	@Override
	public int shopupdate(ShopVO vo) throws Exception {
		
		return dao.shopupdate(vo);
	}
	
	
	
	
	
	

}
