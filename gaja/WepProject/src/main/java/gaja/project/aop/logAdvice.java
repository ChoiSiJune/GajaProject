package gaja.project.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class logAdvice {
	
	private static final Logger logger = LoggerFactory.getLogger(logAdvice.class);
	
	@Before("execution(* gaja.project.service.BoardService*.*(..))")
	public void startLog(JoinPoint jp) {
		
		
		logger.info("-----------------------------------------------");
		logger.info("------------------------------------------------");
		logger.info(Arrays.toString(jp.getArgs()));
		
	}

			


}
