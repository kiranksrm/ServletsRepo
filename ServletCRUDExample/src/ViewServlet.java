

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
		
		
		int pageNum=1;
		int totalRecordsToDisplayPerPage=2;
		
		out.print("<a href='index.html'>Add New Employee</a> ");
		out.print("<h1>Employees List</h1>");
		List<Emp> empList=EmpDao.getAllEmployees();
		int totalPagesRequired=1;
		if(null!=empList && empList.size()>2)
		{
			//Calc logic
			 totalPagesRequired=empList.size()/totalRecordsToDisplayPerPage;
		}
		else if(null!=empList && empList.size()<2)
		{
			
		}
		
		String pageId = request.getParameter("Page");
		if (pageId == null)
			pageNum = 1;
		else
			pageNum = Integer.parseInt(pageId);
		out.print("<table border='1' width='100%'>");
		out.print("<tr> <th>ID </th> <th>NAME</th> <th>Password</th> <th>Email</th> <th>Country</th> <th>Edit</th><th>Delete</th></tr>");
		int count=0;
		if(pageNum==1)
		{
			for(int j=0;j<empList.size();j++)
			{
				Emp e=empList.get(j);
				if(count>2)
					break;
				out.print("<tr> <td>"+e.getId()+"</td> <td>"+e.getName()+"</td> <td>"+e.getPassword()+"</td> <td>"+e.getEmail()+"</td> <td>"+e.getCountry()+"</td> <td> <a href='EditServlet?id="+e.getId()+"'>Edit</a></td> <td> <a href='DeleteServlet?id="+e.getId()+"'>Delete</a></td>           </tr>");
				count++;
			}
			out.print("</table>");
		}
		if(pageNum==2)
		{
			for(int j=pageNum;j<empList.size();j++)
			{
				Emp e=empList.get(j);
				if(count>2)
					break;
				out.print("<tr> <td>"+e.getId()+"</td> <td>"+e.getName()+"</td> <td>"+e.getPassword()+"</td> <td>"+e.getEmail()+"</td> <td>"+e.getCountry()+"</td> <td> <a href='EditServlet?id="+e.getId()+"'>Edit</a></td> <td> <a href='DeleteServlet?id="+e.getId()+"'>Delete</a></td>           </tr>");
				count++;
			}
			out.print("</table>");
		}
		if(pageNum==3)
		{
			for(int j=pageNum;j<empList.size();j++)
			{
				Emp e=empList.get(j);
				if(count>2)
					break;
				out.print("<tr> <td>"+e.getId()+"</td> <td>"+e.getName()+"</td> <td>"+e.getPassword()+"</td> <td>"+e.getEmail()+"</td> <td>"+e.getCountry()+"</td> <td> <a href='EditServlet?id="+e.getId()+"'>Edit</a></td> <td> <a href='DeleteServlet?id="+e.getId()+"'>Delete</a></td>           </tr>");
				count++;
			}
			out.print("</table>");
		}
		for(int i=1; i<=totalPagesRequired;i++)
		{
			out.print("<a href='ViewServlet?Page="+i+"'>"+i+"</a>&nbsp;&nbsp;");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
