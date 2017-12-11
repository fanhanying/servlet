package com.framework;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet{
	
	@Override
	public void destroy() {
//		System.out.println("destroy it");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
//		System.out.println("init it");
//		System.out.println("MyServlet init value " + config.getInitParameter("MyServlet"));
//		System.out.println("MyServlet servlet name " + config.getServletName());
//		System.out.println("MyServlet servlet name " + config.getServletContext().getRealPath("note.txt"));
//		System.out.println("MyServlet contextParam " + config.getServletContext().getInitParameter("contextParam"));
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
//		System.out.println("");
//		System.out.println("service it");
//		String name = request.getParameter("name");
//		String id = request.getParameter("id");
//		System.out.println(id + "," + name);
//		System.out.println(request.getServletContext().getRealPath("note.txt"));
	}

}
