package gaja.project.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {
	

	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,
			Object handler) throws Exception
	{
		
		
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("id")== null)
		{ response.sendRedirect("/login"); return false; }
		
		
		
	
		return true;	
	}

	
	

}
