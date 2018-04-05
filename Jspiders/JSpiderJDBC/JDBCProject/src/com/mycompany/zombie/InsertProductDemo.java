package com.mycompany.zombie;
import java.sql.*;
import com.mycompany.zombie.PropertyReaderUtility;
public class InsertProductDemo {
	public static void main(String[] args) {
		
	
	String driver=PropertyReaderUtility.getPropertyVal("driver");
	String url=PropertyReaderUtility.getPropertyVal("url");
	String pwd=PropertyReaderUtility.getPropertyVal("password");
	String user=PropertyReaderUtility.getPropertyVal("user");
	String insertQry="insert into test.product values(?,?,?)";
	
	try{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,pwd);
		PreparedStatement pstmt = con.prepareStatement(insertQry);
		
		pstmt.setString(2, "Shampoo");
		pstmt.setDouble(3, 300);
		pstmt.setInt(1, 5);
		pstmt.execute();
		
		pstmt.setString(2, "tv");
		pstmt.setDouble(3, 50000);
		pstmt.setInt(1, 6);
		pstmt.execute();
		
		pstmt.setString(2, "laptop");
		pstmt.setDouble(3, 300);
		pstmt.setInt(1, 7);
		pstmt.execute();
		System.out.println("Success");
		
		pstmt.close(); con.close();
		
		
	}catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
	}

}

}