package gaja.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gaja.project.domain.ReplyVO;
import gaja.project.domain.pageing;
import gaja.project.persistence.BoardDAO;
import gaja.project.persistence.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService {

	
	  @Inject
	  private ReplyDAO replyDAO;
	  
	  @Inject BoardDAO boardDAO;

	@Transactional  
	@Override
	public void addReply(ReplyVO vo) throws Exception {
		
		
		replyDAO.create(vo);
		boardDAO.updateReplycnt(vo.getBno(), 1);
	}

	@Override
	public List<ReplyVO> listReply(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return replyDAO.list(bno);
	}

	@Override
	public void modifyReply(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		


	    replyDAO.update(vo);

	}
	@Transactional  
	@Override
	public void removeReply(Integer rno) throws Exception {
		// TODO Auto-generated method stub
		
	
		int bno = replyDAO.getbno(rno);
		replyDAO.delete(rno);
		
		boardDAO.updateReplycnt(bno, -1);
	}

	@Override
	public List<ReplyVO> listReplyPage(Integer bno, pageing page) throws Exception {
		// TODO Auto-generated method stub
		
		return replyDAO.listpage(bno, page);

	}

	@Override
	public int count(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return replyDAO.count(bno);
	}

}
