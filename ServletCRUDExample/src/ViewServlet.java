

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<a href='index.html'>Add New Employee</a> ");
		out.print("<h1>Employees List</h1>");
		List<Emp> empList=EmpDao.getAllEmployees();
		
		out.print("<table border='1' width='100%'>");
		out.print("<tr> <th>ID </th> <th>NAME</th> <th>Password</th> <th>Email</th> <th>Country</th> <th>Edit</th><th>Delete</th></tr>");
		for(Emp e: empList)
		{
			out.print("<tr> <td>"+e.getId()+"</td> <td>"+e.getName()+"</td> <td>"+e.getPassword()+"</td> <td>"+e.getEmail()+"</td> <td>"+e.getCountry()+"</td> <td> <a href='EditServlet?id="+e.getId()+"'>Edit</a></td> <td> <a href='DeleteServlet?id="+e.getId()+"'>Delete</a></td>           </tr>");
		}
		out.print("</table>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
