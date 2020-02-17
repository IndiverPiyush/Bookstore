package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class UserLoginServlet extends GenericServlet{
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
	boolean z=id.validate(uName, pWord, submit, sct);
	if(z) {
		String fName=(String)sct.getAttribute("fName");
		pw.println("Welcome User:"+fName+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Link2.html");
		rd.include(req, res);
	}else {
		pw.println("Invalid UserName or Password<br>");
		RequestDispatcher rd=req.getRequestDispatcher("ULogin.html");
		rd.include(req,res);
	}
 }
}