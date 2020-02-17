package test;
import java.sql.*;
public class RegisterDAO {
	public int k;
	public int register(RegBean rb) {
		try {
			Connection con=DBConnection.getcon();
			PreparedStatement ps=con.prepareStatement("insert into userreg20 values(?,?,?,?,?,?,?)");
			ps.setString(1,rb.getuName());
			ps.setString(2,rb.getpWord());
			ps.setString(3,rb.getfName());
			ps.setString(4,rb.getlName());
			ps.setString(5,rb.getaddr());
			ps.setLong(6,rb.getphNo());
			ps.setString(7,rb.getmId());
			k=ps.executeUpdate();
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
