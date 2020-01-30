import java.sql.*;
import java.util.Scanner;
import java.io.*;
public class MedicineIns {
	public static void main(String[] args) throws SQLException 
    {
		Connection conn =null;
		PreparedStatement ps=null;
		Scanner sc=null;
		try {
			sc=new Scanner(System.in);
			int n=0;
			if(sc!=null) {
				 System.out.println("Enter the no of records to insert in medicine table");
                 n=sc.nextInt();
			}
			String driver ="com.mysql.jdbc.Driver";
			 String url ="jdbc:mysql://localhost:3306/csvrecords?useSSL=false";
			 String username = "root";
			 String password = "rock321";
			     conn=DriverManager.getConnection(url,username,password);
			     if(conn!=null) {
			    	 ps=conn.prepareStatement("insert into medicine values(?,?,?,?,?,?,?)");
			    	 if(ps!=null && sc!=null) {
			    		 for(int i=1;i<=n;++i) {
			    			 System.out.println("Enter the id");
			    		   	 int id=sc.nextInt();
			    		   	 
			    		   	 System.out.println("Enter the name");
			    		   	 String name=sc.next();
			    		   	 System.out.println("Enter the company name");
			    		     String comp=sc.next();
			    		   	 System.out.println("Enter the warning");
			    		     String warn=sc.next();

			    		   	 System.out.println("Enter the price");
			    		   	 int price=sc.nextInt();
			    		   	 System.out.println("Enter the quantity");
			    		   	 int quantity=sc.nextInt();
			    		   	 System.out.println("Enter the rack no");
			    		   	int rackno=sc.nextInt();
			    		    
			    		   	ps.setInt(1,id);
			    		   	ps.setString(2,name);
			    		   	ps.setString(3,comp);
			    		   	ps.setString(4,warn);
			    		   	ps.setInt(5,price);
			    		   	ps.setInt(6,quantity);
			    		   	ps.setInt(7,rackno);
			    		    int result=ps.executeUpdate();
			    		    
			    		   	if(result==0) 
			    		      	 System.out.println(i+"Medicine details not inserted");
			    		      	 else System.out.println(i+"Medicine details  inserted");
			    		 }		
			    	 }
			     }
		} catch(SQLException se) {
			se.printStackTrace();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(ps!=null) 
					ps.close();
				
			}catch(SQLException se) {
				se.printStackTrace();
			} 
			try {
				if(conn!=null) 
					conn.close();
			}catch(SQLException se1) {
				se1.printStackTrace();
			}
		}
		
    }
}
