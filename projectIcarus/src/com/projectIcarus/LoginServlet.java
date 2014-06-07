package com.projectIcarus;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd;
		
		rd = req.getRequestDispatcher("welcome.jsp");		
		rd.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("index.jsp");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(username != null && username.contains("billy"))
		{
			if(password != null && password.contains("fucknugget"))
			{
				rd = req.getRequestDispatcher("welcome.jsp");
			}
		}
		
		rd.forward(req, resp);
	}

}
