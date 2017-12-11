package com.framework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServletTest extends MyHttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("name: " + request.getParameter("name"));
//		System.out.println("id: " + request.getParameter("id"));
//		ServletContext context = getServletConfig().getServletContext();
//		System.out.println("Servletcontextpath: " + context.getContextPath());
//		System.out.println("querystring: " + request.getQueryString());
//		System.out.println("ContextPath: " + request.getContextPath());
//		System.out.println("RequestURI: " + request.getRequestURI());
//		System.out.println("RequestURL: " + request.getRequestURL());
//		System.out.println("ServletConfig: " + getServletConfig().getInitParameter("MyHttpServletTest"));
	}
	
	@Override
	public void init() throws ServletException {
//		System.out.println("init ... ");
	}
}
