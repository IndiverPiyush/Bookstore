package test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
@SuppressWarnings("serial")
public class ViewBooksServlet1 extends GenericServlet{
	public Connection con;
	@Override
	public void init() throws ServletException{
		con=DBConnection.getcon();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res) 
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ServletContext sct=this.getServletContext();
		String fName=(String)sct.getAttribute("fName");
		pw.println("Welcome ADMIN:"+fName+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Link1.html");
		rd.include(req,res);
		try {
			PreparedStatement ps=con.prepareStatement("select * from book20");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				pw.println("<br>"+rs.getString(1)+"&nbsp&nbsp"+rs.getString(2)+"&nbspnbsp"+rs.getString(3)+"&nbsp&nbsp"+rs.getFloat(4)+"&nbsp&nbsp"+rs.getInt(5));
			}
		}catch(Exception e) {e.printStackTrace();}
	}
}
