package com.framework;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyGenericServletTest extends MyGenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("MyGenericServletTest-->InitParameter: " + this.getServletConfig().getInitParameter("MyGenericServletTest"));
		System.out.println(request.getRealPath("note.txt"));
	}

}
