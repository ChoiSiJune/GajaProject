package gaja.project.persistence;

import java.util.List;

import gaja.project.domain.Criteria;
import gaja.project.domain.MemberVO;
import gaja.project.domain.OrderInfoVO;
import gaja.project.domain.SelectVO;
import gaja.project.domain.pageing;

public interface MemberDAO {
	
	public String idCheck(String id) throws Exception;
	public int Join(MemberVO vo) throws Exception;
	public String login(MemberVO vo) throws Exception;
	public List<MemberVO> memberall(pageing page) throws Exception;
	public MemberVO orderinfo(String id) throws Exception;
	public List<OrderInfoVO> orderlist(pageing page) throws Exception;
	public List<SelectVO> inorder(int mnum) throws Exception;
	public int myupdate(MemberVO vo) throws Exception;
	public int countPaging(pageing page) throws Exception;
	public int countmember(pageing page) throws Exception;
	
	
	

}
