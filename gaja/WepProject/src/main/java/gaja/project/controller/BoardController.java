package gaja.project.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import gaja.project.domain.BoardVO;
import gaja.project.domain.PageCri;
import gaja.project.domain.pageing;
import gaja.project.service.BoardService;

@Controller
public class BoardController {
	
	
	@Inject
	BoardService board;
	
	
@RequestMapping(value = "/board", method = RequestMethod.GET)
public String BoardList(Model model, pageing page) throws Exception {
	
	
	model.addAttribute("BoardList", board.pagelist(page)); // 페이지 목록에 따른 데이터 (limit로 가져옴)
	
	PageCri pagecri = new PageCri();
	pagecri.setPage(page);
	pagecri.setTotalCount(board.countPaging(page));  //토탈페이지에서 모든 페이징값을 계산함
	
	model.addAttribute("pagecri" , pagecri); // 하단 페이징 데이터 
	


	return "/Board/BoardList";	
}
	


@RequestMapping(value = "/BoardReg", method = RequestMethod.GET)
public String BoardReg() {
		
	return "/Board/BoardReg";
}


@RequestMapping(value = "/BoardReg", method = RequestMethod.POST)
public String BoardRegImpl(BoardVO vo,RedirectAttributes rttr) throws Exception {
		
	board.regist(vo);

	rttr.addFlashAttribute("result" , "글입력이 완료되었습니다.");
		
	return "/Board/redirect:/board";
}



@RequestMapping(value = "/read", method = RequestMethod.GET) //@ModelAttribute는 뷰까지 파라미터를 전달해줌
public String Boardread(Model model,@RequestParam("bno") int bno,@ModelAttribute("cri") pageing cri) throws Exception {
	
	model.addAttribute("board", board.read(bno));
	model.addAttribute("pagecri",cri);
 
	
	
	return "/Board/DetailBoard";	
}

@RequestMapping(value="/modify", method = RequestMethod.GET)
public String BoardModify(Model model,@RequestParam("bno") int bno,@ModelAttribute("cri") pageing cri) throws Exception

{
		
	model.addAttribute("board", board.read(bno));
	
	
	return "/Board/BoardModify";
}



@RequestMapping(value="/modify" , method= RequestMethod.POST)
public String BoardmodifyImpl(BoardVO vo,RedirectAttributes rttr,pageing cri) throws Exception {
	
	
	String result = board.update(vo);
	
	
	rttr.addAttribute("page",cri.getPage());
	rttr.addAttribute("perPageNum",cri.getPerPageNum());
	rttr.addAttribute("searchType",cri.getSearchType());
	rttr.addAttribute("keyword",cri.getKeyword());
		
	rttr.addFlashAttribute("result", result);
	

	return "redirect:/board";
	
}



@RequestMapping(value = "/remove", method = RequestMethod.GET)
public String BoardRemove(@RequestParam("bno") int bno,RedirectAttributes rttr,pageing cri) throws Exception
{
	
	rttr.addAttribute("page",cri.getPage());
	rttr.addAttribute("perPageNum",cri.getPerPageNum());
	rttr.addAttribute("searchType",cri.getSearchType());
	rttr.addAttribute("keyword",cri.getKeyword());
	
	String result = board.delete(bno);
	
	rttr.addFlashAttribute("result", result);
	
	
	return "redirect:/board";
	
	
	
}





}
