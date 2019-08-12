package gaja.project.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import gaja.project.domain.CartVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.SelectVO;
import gaja.project.domain.ShopVO;



@Repository
public class ShopDAOImpl implements ShopDAO{
	
	

	
    @Inject
	private SqlSession session;
    
 
	  
	  private static String namespace = "gaja.project.mapper.shopMapper";

	@Override
	public List<ShopVO> shoplist(ShopVO vo) throws Exception {
		
		
				
		return session.selectList(namespace + ".shoplist", vo);
	}

	
	@Override
	public ShopVO shopdetail(ShopVO vo) throws Exception {
		
		
		
		return session.selectOne(namespace + ".ProductDetail", vo);
	}


	@Override
	public List<ShopVO> shopsearch(HashMap params) throws Exception {
	
	
		
		return session.selectList(namespace + ".searchshop",params);
	}


	@Override
	public int insertOrder(SelectVO vo) throws Exception {
		
		
		
		
		return session.insert(namespace + ".order", vo);
	}

	

	@Override
	public int insertCart(CartVO vo) throws Exception {
	
		
		return session.insert(namespace + ".cart", vo);
	}


	@Override
	public List<CartVO> cartlist(int mnum) throws Exception {
	
		return session.selectList(namespace + ".cartlist", mnum);
	}


	
	@Override
	public int deletecart(int mnum) throws Exception {
		
		return session.delete(namespace + ".cartdelete", mnum);
	}


	@Override
	public int insertShop(ShopVO vo) throws Exception {
	
		return session.insert(namespace + ".shopinsert", vo);
	}


	@Override
	public void delivery(OrderInfoVO vo) throws Exception {
	
			session.update(namespace + ".delivery", vo);
	}


	@Override
	public int cartdelete(int mnum) throws Exception {
		
		return session.delete(namespace + ".cartdelete", mnum);
	}


	@Override
	public int amountdown(SelectVO svo) throws Exception {
	
		return session.update(namespace + ".amount", svo);
	}


	@Override
	public int shopdelete(int snum) throws Exception {
		
		
	 return session.delete(namespace + ".shopdelete", snum);
	}


	@Override
	public int shopupdate(ShopVO vo) throws Exception {
		
		return session.update(namespace + ".shopupdate", vo);
	}



}
