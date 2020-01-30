import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateMedJDBC {
	public static void main(String args[]) {
	 try {
		 String driver ="com.mysql.jdbc.Driver";
		 String url ="jdbc:mysql://localhost:3306/csvrecords?useSSL=false";
		 String username = "root";
		 String password = "rock321";
	    Connection conn=DriverManager.getConnection(url,username,password);

	    Statement st= conn.createStatement();
	    String sql = "UPDATE medicine "+"set company='ranbaxy'"+"where id=5";
	    st.executeUpdate(sql);
	    System.out.println("Update complete");
//	    while(rs.next()) {
	// System.out.println("Roll No:"+rs.getInt(1)+"\tName:"+rs.getString(2)+"\tMobile:"+rs.getLong(3));
//	    	
	//}
	    
	    
	    }catch(Exception e) {System.out.println(e);}}	
}
