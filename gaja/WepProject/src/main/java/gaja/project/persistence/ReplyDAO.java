package gaja.project.persistence;

import java.util.List;

import gaja.project.domain.ReplyVO;
import gaja.project.domain.pageing;

public interface ReplyDAO {
	
	public List<ReplyVO> list(int bno) throws Exception;
	public void create(ReplyVO vo) throws Exception;
	public void update(ReplyVO vo) throws Exception;
	public void delete(int rno) throws Exception;
	public List<ReplyVO> listpage(Integer bno, pageing page) throws Exception;
	public int count(int bno) throws Exception;
	public int getbno(int rno) throws Exception;

	

}
