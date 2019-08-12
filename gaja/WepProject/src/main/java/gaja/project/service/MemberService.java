package gaja.project.service;

import java.util.List;

import gaja.project.domain.Criteria;
import gaja.project.domain.MemberVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.SelectVO;
import gaja.project.domain.pageing;

public interface MemberService {
	public String idCheckd(String id) throws Exception;
	public int join(MemberVO vo) throws Exception;
	public String login(MemberVO vo) throws Exception;
	public List<MemberVO> memberall(pageing page) throws Exception;
	public MemberVO orderinfo(String id) throws Exception;
	public List<OrderInfoVO> orderlist(pageing page) throws Exception;
	public List<SelectVO> inorder(int mnum) throws Exception;
	public int myupdate(MemberVO vo) throws Exception;
	public int listCountCriteria(pageing page) throws Exception;
	public int memberCountCriteria(pageing page) throws Exception;
	


}
