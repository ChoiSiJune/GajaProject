package gaja.project.service;

import java.util.List;

import gaja.project.domain.BoardVO;
import gaja.project.domain.pageing;


public interface BoardService {
	
	 
		public void regist(BoardVO board) throws Exception;
		public BoardVO read(int bno) throws Exception;
		public String update(BoardVO board) throws Exception;
		public String delete(int bno) throws Exception;
		public List<BoardVO> pagelist(pageing page) throws Exception;
		public int countPaging(pageing page) throws Exception;

}
