package gaja.project.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import gaja.project.domain.Criteria;
import gaja.project.domain.MemberVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.SelectVO;
import gaja.project.domain.pageing;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
    @Inject
	private SqlSession session;
    
    
    private static String namespace = "gaja.project.mapper.memberMapper";

	@Override
	public String idCheck(String id) throws Exception {
		
		
		

		
		String test = session.selectOne(namespace + ".idchecked", id);
		
	
		
		return test;
	
		 
	}

	@Override
	public int Join(MemberVO vo) throws Exception {
		
		int result = session.insert(namespace + ".join", vo);
		
		return result;
	}

	
	
	
	@Override
	public String login(MemberVO vo) throws Exception {
		
	
		String result = session.selectOne(namespace + ".login", vo);
		
		return result;
	}

	@Override
	public List<MemberVO> memberall(pageing page) throws Exception {

		return session.selectList(namespace + ".memberinfo", page);
	}

	
	
	@Override
	public MemberVO orderinfo(String id) throws Exception {
		
		return session.selectOne(namespace + ".orderinfo", id);
	}

	@Override
	public List<OrderInfoVO> orderlist(pageing page) throws Exception {
		
		return session.selectList(namespace + ".orderlist",page);
	}

	@Override
	public List<SelectVO> inorder(int mnum) throws Exception {
		
		
		
		return session.selectList(namespace + ".inorder",mnum);
	}

	@Override
	public int myupdate(MemberVO vo) throws Exception {
		
		return session.update(namespace + ".myupdate",vo);
	}

	@Override
	public int countPaging(pageing page) throws Exception {
		
		return session.selectOne(namespace + ".countPaging",page);
	}

	@Override
	public int countmember(pageing page) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".membercount",page);
	}

}
