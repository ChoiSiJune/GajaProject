package gaja.project.persistence;

import java.util.HashMap;
import java.util.List;

import gaja.project.domain.CartVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.SelectVO;
import gaja.project.domain.ShopVO;

public interface ShopDAO {
	
	public List<ShopVO> shoplist(ShopVO vo) throws Exception;
	
	public ShopVO shopdetail(ShopVO vo) throws Exception;
	
	public List<ShopVO> shopsearch(HashMap params) throws Exception;
	
	public int insertOrder(SelectVO vo) throws Exception;
	
	public int insertCart(CartVO vo) throws Exception;
	
	public List<CartVO> cartlist(int mnum) throws Exception;
	
	public int deletecart(int mnum) throws Exception;
		
	public int insertShop(ShopVO vo) throws Exception;
		
	public void delivery(OrderInfoVO vo) throws Exception;
	
	
	public int cartdelete(int mnum) throws Exception;
	
	public int amountdown(SelectVO svo) throws Exception;
	
	public int shopdelete(int snum) throws Exception;
	
	public int shopupdate(ShopVO vo) throws Exception;
	
	

	
}
