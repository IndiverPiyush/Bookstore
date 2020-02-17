package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RegServlet2 extends GenericServlet{
	public RegBean rb;
	public ServletContext sct;
	@Override
	public void init() throws ServletException{
		sct=this.getServletContext();
		rb=(RegBean)sct.getAttribute("beanRef");
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String addr=req.getParameter("addr");
		Long phNo=Long.parseLong(req.getParameter("phno"));
		String mId=req.getParameter("mid");
		rb.setaddr(addr);
		rb.setphNo(phNo);
		rb.setmId(mId);
		pw.println("your registration details are valid");
		pw.println("<a href='dis'> Click</a>");
		pw.println("to view registration details");
	}

}
