package gaja.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionAdvice {
	
	
	private static final Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);
	
	
	@ExceptionHandler(Exception.class)
	public ModelAndView errorModelAndView(Exception ex) {  //@ControllerAdvice 타입의 클래스의 메소드는 model을 파라미터로 사용불가. 떄문에 modelandview 사용
		
	
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("/error_common");
		model.addObject("exception", ex);
		
		return model;
		
		
	}

}
