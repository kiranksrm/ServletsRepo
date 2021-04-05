package com.lms.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String userId=request.getParameter("userName");
		String password= request.getParameter("Password");
		String confirmPassword = request.getParameter("confirmPassword");
		String gender= request.getParameter("geneder");
		String email= request.getParameter("email");
		String addressLine1 =request.getParameter("addressLine1");
		String addressLine2 =request.getParameter("addressLine2");
		String userCity= request.getParameter("userCity");
		String userState=request.getParameter("userState");
		String userCountry= request.getParameter("userCountry");
		String zipcode = request.getParameter("zipCode");
		String mobile = request.getParameter("mobile");
		
		
		try
		{
		//1. load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver"); //if you are using JDBC4.0 this is optional
		  //TRY with Resources
		
		//2. Get The Connection Obj by using DriverManager.getConnection();
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/lms", "root", "admin");
		
		String insertQuery="insert into user values(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setString(1, name);
		ps.setString(2, userId);
		ps.setString(3, confirmPassword);
		ps.setString(4, gender);
		ps.setString(5, email);
		ps.setString(6, addressLine1);
		ps.setString(7, addressLine2);
		ps.setString(8, userCity);
		ps.setString(9, userState);
		ps.setString(10, userCountry);
		ps.setInt(11, Integer.parseInt(zipcode));
		ps.setInt(12, Integer.parseInt(mobile));
		
		System.out.println(ps.toString());
		
		int count=ps.executeUpdate();
		if(count>0)
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.print("you have successfully registerd..");
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
	}

}
