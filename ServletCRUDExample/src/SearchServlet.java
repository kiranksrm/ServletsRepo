

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String query=request.getParameter("search");
		//If you entering a ID or number
		
		//if you entering the name
		out.print("<h1>Employees Search List</h1>");
		List<Emp> empList=EmpDao.search(query);
		
		out.print("<table border='1' width='100%'>");
		out.print("<tr> <th>ID </th> <th>NAME</th> <th>Password</th> <th>Email</th> <th>Country</th> <th>Edit</th><th>Delete</th></tr>");
		for(Emp e: empList)
		{
			out.print("<tr> <td>"+e.getId()+"</td> <td>"+e.getName()+"</td> <td>"+e.getPassword()+"</td> <td>"+e.getEmail()+"</td> <td>"+e.getCountry()+"</td> <td> <a href='EditServlet?id="+e.getId()+"'>Edit</a></td> <td> <a href='DeleteServlet?id="+e.getId()+"'>Delete</a></td>           </tr>");
		}
		out.print("</table>");
		out.print("<a href=\"#\">Export to WORD</a> &nbsp;&nbsp;&nbsp;<a href=\"/ExportToPDF\">Export to PDF</a>");
		out.print("<br/>");
		out.print("<a href=\"https://www.qries.com/\">\r\n"
				+ "         <img alt=\"Qries\" src=\"https://www.qries.com/images/banner_logo.png\"\r\n"
				+ "         width=60\" height=\"30\">\r\n"
				+ "      </a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
