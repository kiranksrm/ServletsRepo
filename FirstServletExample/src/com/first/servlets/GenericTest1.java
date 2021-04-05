package com.first.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GenericTest1
 */
@WebServlet("/GenericTest1")
public class GenericTest1 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public GenericTest1() {
        super();
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Inside GenericTest1 Service method.");
		PrintWriter out=response.getWriter();
		out.print("<html> <body>");
		out.print("<h1> Welcome to Servlet Programming GENERICTEST1</h1>");
		out.print("</body></html>");
	}

}
