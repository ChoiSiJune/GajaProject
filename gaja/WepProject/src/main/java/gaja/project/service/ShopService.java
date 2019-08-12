package gaja.project.service;

import java.util.HashMap;
import java.util.List;

import gaja.project.domain.CartVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.OrderVO;
import gaja.project.domain.ShopVO;


public interface ShopService {
	
	
	public List<ShopVO> shoplist(String path,ShopVO vo) throws Exception;
	
	public ShopVO ProductDetail(String path,ShopVO vo) throws Exception;
	
	public List<ShopVO> shopsearch(HashMap params,String path) throws Exception;
	
	public int insertOrder(OrderVO vo,String order) throws Exception;

	public int insertCart(CartVO vo) throws Exception;
	
	public List<CartVO> cartlist(String path,int mnum) throws Exception;
	
	public int insertshop(ShopVO vo) throws Exception;
	
	public void delivery(OrderInfoVO vo) throws Exception;
	
	public int cartdelete(int mnum) throws Exception;
	
	public int shopdelete(int snum) throws Exception;
	
	public int shopupdate(ShopVO vo) throws Exception;


}
