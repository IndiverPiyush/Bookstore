package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class AdminLoginServlet extends GenericServlet{
	public ServletContext sct;
	@Override
	public void init() throws ServletException{
		sct=this.getServletContext();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String uName=req.getParameter("uname");
		String pWord=req.getParameter("pword");
		String submit=req.getParameter("s1");
		LoginDAO id=new LoginDAO();
		boolean k=id.validate(uName,pWord,submit,sct);
		if(k) {
			String fName=(String)sct.getAttribute("fName");
			pw.println("Welcome Admin:"+fName+"<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Link1.html");
			rd.include(req,res);
		}else {
			pw.print("Invalid Username orPassworD");
			RequestDispatcher rd=req.getRequestDispatcher("ALogin.html");
			rd.include(req,res);
		}
		
	}

}
