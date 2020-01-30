import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
public class JDBCInsert {
	public static void main(String[] args) throws SQLException 
    {
      
	 try {
	 String driver ="com.mysql.jdbc.Driver";
	 String url ="jdbc:mysql://localhost:3306/csvrecords?useSSL=false";
	 String username = "root";
	 String password = "rock321";
    Connection conn=DriverManager.getConnection(url,username,password);

    Statement st= conn.createStatement();
    int update =st.executeUpdate("INSERT INTO student values(3,'John',8756743733)");
    System.out.println(update+ "Row Inserted");
//    while(rs.next()) {
// System.out.println("Roll No:"+rs.getInt(1)+"\tName:"+rs.getString(2)+"\tMobile:"+rs.getLong(3));
//    	
//}
    
    
    }
    catch(Exception e) {System.out.println(e);}
	
}
}
