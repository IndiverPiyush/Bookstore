package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class FinalRegServlet extends GenericServlet{
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
		RegisterDAO rd=new RegisterDAO();
		int k=rd.register(rb);
		if(k>0) {
			pw.println("User Registered Successfully---<br>");
			RequestDispatcher rds=req.getRequestDispatcher("ULogin.html");
			rds.include(req,res);
		}
	}

}
