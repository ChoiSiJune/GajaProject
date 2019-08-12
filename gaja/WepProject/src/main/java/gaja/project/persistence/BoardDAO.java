package gaja.project.persistence;

import java.util.List;

import gaja.project.domain.BoardVO;
import gaja.project.domain.pageing;



public interface BoardDAO {
	
	public void createBoard(BoardVO vo) throws Exception;;
	public BoardVO read(Integer bno) throws Exception;
	public String update(BoardVO vo) throws Exception;
	public String delete(Integer bno) throws Exception;
	public List<BoardVO> listpageing(pageing page) throws Exception;
	public int countPaging(pageing page)throws Exception;
	public void updateReplycnt(int bno,int amount) throws Exception;
	
	

}
