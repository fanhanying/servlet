package com.framework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyHttpServlet extends MyGenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		if ("GET".compareToIgnoreCase(req.getMethod()) == 0) {
			doGet(req, res);
		} else if ("POST".compareToIgnoreCase(req.getMethod()) == 0) {
			doPost(req, res);
		}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
	}

	
	
}
