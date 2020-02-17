package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class AddBookServlet extends GenericServlet{
	public ServletContext sct;
	public BookBean bb;
	@Override
	public void init() throws ServletException{
		sct=this.getServletContext();
		bb=new BookBean();
	}
	@Override
	public void service(ServletRequest req,ServletResponse res)
	throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String bCode=req.getParameter("bcode");
		String bName=req.getParameter("bname");
		String bAuthor=req.getParameter("bauthor");
		float bPrice=Float.parseFloat(req.getParameter("bprice"));
		int bQty=Integer.parseInt(req.getParameter("bqty"));
		String fName=(String)sct.getAttribute("fName");
		bb.setbCode(bCode);
		bb.setbName(bName);
		bb.setbAuthor(bAuthor);
		bb.setbPrice(bPrice);
		bb.setbQty(bQty);
		pw.println("welcom Admin:"+fName+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("Link1.html");
		rd.include(req,res);
		AddBookDAO abd=new AddBookDAO();
		int z=abd.addBook(bb);
		if(z>0)
		{
			pw.println("<br>Book Added Successfully.....");
		}
	}
	

}
