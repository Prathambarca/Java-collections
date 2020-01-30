	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;
	import java.sql.*;
	import java.io.*;
	public class MedicineInsertJDBC {
		/**
		 * @param args
		 * @throws SQLException
		 */
		public static void main(String[] args) throws SQLException 
	    {
	      
		 try {
		 String driver ="com.mysql.jdbc.Driver";
		 String url ="jdbc:mysql://localhost:3306/csvrecords?useSSL=false";
		 String username = "root";
		 String password = "rock321";
		 
		 System.out.println("Enter the no of records to insert in medicine table");
		 Scanner sc=new Scanner(System.in);
		 int cnt=sc.nextInt();
	    Connection conn=DriverManager.getConnection(url,username,password);
	
	    PreparedStatement st= conn.prepareStatement("insert into medicine values(?,?,?,?,?,?,?)");
	    for(int i=1;i<=cnt;i++) {
	   	
	//   	 System.out.println("Enter the id");
	//   	 int id=sc.nextInt();
	   	 System.out.println("Enter the id");
	   	 int id=sc.nextInt();
	   	 
	   	 System.out.println("Enter the name");
	   	 String name=sc.next();
	   	 System.out.println("Enter the company name");
	     String comp=sc.next();
	     System.out.println("Enter the warning msg");
	     String warn=sc.next();
	   	 System.out.println("Enter the price");
	   	 int price=sc.nextInt();
	   	 System.out.println("Enter the quantity");
	   	 int quantity=sc.nextInt();
	   	 System.out.println("Enter the rack no");
	   	int rackno=sc.nextInt();
	    
	   	st.setInt(1,id);
	   	st.setString(2,name);
	   	st.setString(3,comp);
	   	st.setInt(4,price);
	   	st.setString(5,warn);
	   	st.setInt(6,quantity);
	   	st.setInt(7,rackno);
	    int result=st.executeUpdate();
	    
	   	if(result==0) {
	      	 System.out.println(i+"Medicine details not inserted");
	      	 
	
	   	}else       	 System.out.println(i+"Medicine details  inserted");
	
	   
	   
	
	
	   	
	
	    }
	    
	conn.close();
	    
	    
	    }catch(Exception e ) {e.printStackTrace();}
	
			 
		 }
		
	}
	
