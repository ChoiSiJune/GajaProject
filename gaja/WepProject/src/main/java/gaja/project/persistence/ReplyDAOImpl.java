package gaja.project.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


import gaja.project.domain.ReplyVO;
import gaja.project.domain.pageing;

@Repository
public class ReplyDAOImpl implements ReplyDAO 

{
	
	private static String namespace = "gaja.project.mapper.ReplyMapper";
	
	@Inject
	private SqlSession session;

	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".list", bno);
	}

	@Override
	public void create(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		
		session.insert(namespace + ".create", vo);

		
	}

	@Override
	public void update(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace + ".update", vo);

	}

	@Override
	public void delete(int rno) throws Exception {
		// TODO Auto-generated method stub
	    session.delete(namespace + ".delete", rno);

	}

	@Override
	public List<ReplyVO> listpage(Integer bno, pageing page) throws Exception {
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("bno", bno);
		map.put("page", page);
		
		 return session.selectList(namespace + ".listpage", map);
	}

	@Override
	public int count(int bno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+ ".count", bno);
	}

	@Override
	public int getbno(int rno) throws Exception {
	
		
		
		return session.selectOne(namespace+ ".bno", rno);
		
		
	}

}
