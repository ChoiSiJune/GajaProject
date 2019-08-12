package gaja.project.service;

import java.util.List;

import gaja.project.domain.ReplyVO;
import gaja.project.domain.pageing;

public interface ReplyService {
	
	public void addReply(ReplyVO vo) throws Exception;

	  public List<ReplyVO> listReply(Integer bno) throws Exception;

	  public void modifyReply(ReplyVO vo) throws Exception;

	  public void removeReply(Integer rno) throws Exception;
	  

	  public List<ReplyVO> listReplyPage(Integer bno, pageing page) 
	      throws Exception;

	  public int count(Integer bno) throws Exception;
	  
	 
	  
	  


}
