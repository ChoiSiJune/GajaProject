package gaja.project.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import gaja.project.domain.BoardVO;
import gaja.project.domain.pageing;




@Repository
public class BoardDAOImpl implements BoardDAO{

	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "gaja.project.mapper.BoardMapper";
	
	
	@Override
	public void createBoard(BoardVO vo) {
				
		sqlSession.insert(namespace+".boardReg",vo);
					
	}

	@Transactional(isolation=Isolation.READ_COMMITTED)
	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		
		sqlSession.selectOne(namespace+".cntupdate", bno);
		BoardVO vo = sqlSession.selectOne(namespace+".boardRead", bno);
		
		return vo;
		
	
	}


	@Override
	public String update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		
		String result="";
		
		if(sqlSession.update(namespace+".boardUpdate",vo) == 0)
		{
		
			 result = "수정 실패";
		}
		else { result = "수정 성공";}
		
		
		
	 return result;
		
	}


	@Override
	public String delete(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		
		
	String result="";
		
		if(sqlSession.delete(namespace+".boardDelete",bno) == 0)
		{
		
			 result = "삭제 실패";
		}
		else { result = "삭제 성공";}
		
		
		
	 return result;
		
	}
		


	@Override
	public List<BoardVO> listpageing(pageing page) throws Exception {
		// TODO Auto-generated method stub
	
		return sqlSession.selectList(namespace + ".listpage", page);
	}


	@Override
	public int countPaging(pageing page) throws Exception {
	   
		return sqlSession.selectOne(namespace + ".totalcount", page);
	}


	@Override
	public void updateReplycnt(int bno, int amount) throws Exception {

		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("bno", bno);
		paramMap.put("amount",amount);
		
		 sqlSession.update(namespace + ".replycntUpdate",paramMap);
	}
	
	
	
	
	

}
