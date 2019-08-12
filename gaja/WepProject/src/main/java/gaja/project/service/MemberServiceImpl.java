package gaja.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import gaja.project.domain.Criteria;
import gaja.project.domain.MemberVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.SelectVO;
import gaja.project.domain.pageing;
import gaja.project.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;

	@Override
	public String idCheckd(String id) throws Exception {
		
	
		
		
		return dao.idCheck(id);
	}

	@Override
	public int join(MemberVO vo) throws Exception {
		
		
		 
		return dao.Join(vo);
	}

	@Override
	public String login(MemberVO vo) throws Exception {
		
		return dao.login(vo);
	}

	@Override
	public List<MemberVO> memberall(pageing page) throws Exception {
		
		return dao.memberall(page) ;
	}

	@Override
	public MemberVO orderinfo(String id) throws Exception {
		
		return dao.orderinfo(id);
	}

	@Override
	public List<OrderInfoVO> orderlist(pageing page) throws Exception {

		return dao.orderlist(page) ;

	}

	@Override
	public List<SelectVO> inorder(int mnum) throws Exception {
		
		return dao.inorder(mnum);
	}

	@Override
	public int myupdate(MemberVO vo) throws Exception {
	
		return dao.myupdate(vo);
	}

	@Override
	public int listCountCriteria(pageing page) throws Exception {
		// TODO Auto-generated method stub
		return dao.countPaging(page);
	}

	@Override
	public int memberCountCriteria(pageing page) throws Exception {
		// TODO Auto-generated method stub
		return dao.countmember(page);
	}

}
