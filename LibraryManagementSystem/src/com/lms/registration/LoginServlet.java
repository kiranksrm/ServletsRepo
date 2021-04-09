package com.lms.registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Inside Service method of Login Servlet");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password= request.getParameter("passWord");
		
		if(userName.equals("ABC") && password.equals("123"))
		{
			RequestDispatcher reqDisp=request.getRequestDispatcher("/LibraryManagementSystem/WelcomeServlet");
			reqDisp.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.print("Sorry, The User Name or Password didnot match!!");
			RequestDispatcher dis=request.getRequestDispatcher("/LibraryManagementSystem/login.html");
			dis.include(request, response);
			
		}
	
	}

}
