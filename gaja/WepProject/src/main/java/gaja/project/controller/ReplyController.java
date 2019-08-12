package gaja.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gaja.project.domain.PageCri;
import gaja.project.domain.ReplyVO;
import gaja.project.domain.pageing;
import gaja.project.service.ReplyService;

@RestController
@RequestMapping("/replies")
public class ReplyController {
	
	
	@Inject 
	ReplyService service;
	
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody ReplyVO vo){
		
		ResponseEntity<String> entity = null;		
		
	    try {
	      service.addReply(vo);
	      entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	    } catch (Exception e) {
	      e.printStackTrace();
	      entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	    }

		
		
		return entity;
		
		
	}
	
	
	
	@RequestMapping(value = "/{bno}/{page}", method = RequestMethod.GET)
	public ResponseEntity<Map<String,Object>> list(@PathVariable("bno") int bno,@PathVariable("page")int page){
		
		
	
		
		ResponseEntity<Map<String,Object>> entity = null;
		
		
		try {
			
			pageing pages = new pageing();
			pages.setPage(page); //현재 페이지 넣기
			
			PageCri cri = new PageCri();
			cri.setPage(pages); // 페이지 객체 변수에 넣기
			
			Map<String, Object>	map = new HashMap<String, Object>();
			List<ReplyVO> list = service.listReplyPage(bno, pages); //결과값 리스트에 넣기
			
		
			map.put("list", list);
			
			int replyCount = service.count(bno);
			cri.setTotalCount(replyCount);
			
			map.put("cri", cri);
			
			
		
			entity = new ResponseEntity<Map<String,Object>>(map, HttpStatus.OK);
			
		
			
			
		} catch (Exception e) {
			
			entity = new ResponseEntity<Map<String,Object>>(HttpStatus.OK);
			
			
		}
		
	
		return entity;
		
			
	}
	
	
	
	@RequestMapping(value = "/{rno}", method = { RequestMethod.PUT, RequestMethod.PATCH })
	  public ResponseEntity<String> update(@PathVariable("rno") Integer rno, @RequestBody ReplyVO vo) {

	    ResponseEntity<String> entity = null;
	    try {
	      vo.setRno(rno);
	      service.modifyReply(vo);

	      entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	    } catch (Exception e) {
	      e.printStackTrace();
	      entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	    }
	    return entity;
	  }

	
	@RequestMapping(value = "/{rno}", method = RequestMethod.DELETE)
	  public ResponseEntity<String> remove(@PathVariable("rno") Integer rno) {

	    ResponseEntity<String> entity = null;
	    try {
	      service.removeReply(rno);
	      entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	    } catch (Exception e) {
	      e.printStackTrace();
	      entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	    }
	    return entity;
	  }

	

}
