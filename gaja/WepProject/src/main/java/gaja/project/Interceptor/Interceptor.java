package gaja.project.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter {
	
	private static final String LOGIN = "id";
	
	
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,
			Object handler,ModelAndView modelandView) throws Exception{
		System.out.println("인터셉트 실행!!!2222222222222222!");
		
		HttpSession session = request.getSession();
	
		ModelMap modelmap = modelandView.getModelMap();
		Object userVO = modelmap.get("id");
		
		if(userVO != null) {
			
			session.setAttribute(LOGIN, userVO);
			System.out.println("인터셉트 실행!!!!" + session.getAttribute(LOGIN));
			
		}
	};
		
		
	
	
	
		public boolean preHandle(HttpServletRequest request,HttpServletResponse response,
				Object handler) throws Exception
		{
			
			
			HttpSession session = request.getSession();
			
			if(session.getAttribute(LOGIN) != null ) {
				
				
				session.removeAttribute(LOGIN);
			}
			
			
			return true;
			
			
			
		}

		
		
		

}