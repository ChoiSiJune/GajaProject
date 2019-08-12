package gaja.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import gaja.project.domain.BoardVO;
import gaja.project.domain.pageing;
import gaja.project.persistence.BoardDAO;


@Service
public class BoardServiceImpl implements BoardService{
	
		@Inject
		private BoardDAO DAO;
	
		

		@Override
		public void regist(BoardVO board) throws Exception {
			// TODO Auto-generated method stub
			
			DAO.createBoard(board);
			
		}

		@Override
		public BoardVO read(int bno) throws Exception {
			// TODO Auto-generated method stub
			return DAO.read(bno);
		}

		@Override
		public String update(BoardVO board) throws Exception {
			// TODO Auto-generated method stub
			
			return DAO.update(board);
			
		}

		@Override
		public String delete(int bno) throws Exception {
			// TODO Auto-generated method stub
		
			
			return DAO.delete(bno);
			
		}

	

		@Override
		public List<BoardVO> pagelist(pageing page) throws Exception {


			return DAO.listpageing(page);
		}

		@Override
		public int countPaging(pageing page) throws Exception {
			
			return DAO.countPaging(page);
		}
	
}

