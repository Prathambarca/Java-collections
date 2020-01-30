import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
public class SelectMedJDBC {
	public static void main(String args[]) {
		   try {
				 String driver ="com.mysql.jdbc.Driver";
				 String url ="jdbc:mysql://localhost:3306/csvrecords?useSSL=false";
				 String username = "root";
				 String password = "rock321";
			    Connection conn=DriverManager.getConnection(url,username,password);

			    Statement st= conn.createStatement();
			    String sql = "SELECT * FROM medicine";
			    st.executeQuery(sql);
				   ResultSet rs=st.executeQuery(sql);

			    System.out.println("ID"+"\t"+"Name"+"\t"+"Company Name"+"\t"+"Warning"+"\t"+"price"+"\t"+"Quantity"+"\t"+"rackno");
			    while(rs.next()) {
			 System.out.println(+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t"+rs.getInt(6)+"\t"+rs.getInt(7));
			    	
			}
			    
			    
			    }catch(Exception e) {System.out.println(e);}
	   }
}
