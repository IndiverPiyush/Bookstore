package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class DisServlet extends GenericServlet{
	public RegBean rb;
	public ServletContext sct;
	@Override
	public void init() throws ServletException{
		sct=this.getServletContext();
		rb=(RegBean)sct.getAttribute("beanRef");
	}
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	pw.println("---Registration details----<br>");
	pw.println("UserName:"+rb.getuName());
	pw.println("<br>PassWord:"+rb.getpWord());
	pw.println("<br>FirstName:"+rb.getfName());
	pw.println("<br>LastName:"+rb.getlName());
	pw.println("<br>Address:"+rb.getaddr());
	pw.println("<br>PhNo:"+rb.getphNo());
	pw.println("<br>MailId:"+rb.getmId());
	pw.println("<br>");
	pw.println("<form action='final' method='post'>");
	pw.println("<input type='submit' value='register'>");
	pw.println("</form>");
	}
}
