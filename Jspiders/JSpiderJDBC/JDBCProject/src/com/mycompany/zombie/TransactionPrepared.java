package com.mycompany.zombie;
import java.sql.*;
import java.util.Random;

import com.mycompany.zombie.PropertyReaderUtility;
public class TransactionPrepared {
	public static void main(String[] args) {
		
	
	String driver=PropertyReaderUtility.getPropertyVal("driver");
	String url=PropertyReaderUtility.getPropertyVal("url");
	String pwd=PropertyReaderUtility.getPropertyVal("password");
	String user=PropertyReaderUtility.getPropertyVal("user");
	String qry1="update test.student set balance = balance-? where Account = ?";
	String qry2="update test.student set balance = balance+? where Account = ?";
	
	Random r = new Random(500000);
	int rn = r.nextInt();
	Connection con=null;
	try{
		Class.forName(driver);
		con=DriverManager.getConnection(url,user,pwd);
		con.setAutoCommit(false);
		
		PreparedStatement stmt = con.prepareStatement(qry1);
		stmt.setDouble(1,2000);
		stmt.setInt(2, 601);
		stmt.executeUpdate();
		
		
		PreparedStatement stmt1 = con.prepareStatement(qry2);
		stmt1.setDouble(1,2000);
		stmt1.setInt(2, 602);
		stmt1.executeUpdate();
					
		System.out.println("Success");
		System.out.println("Transaction id "+rn);
		
		con.commit();
		con.close();
		stmt.close();
		stmt1.close();
		
	}catch(SQLException e){
		e.printStackTrace();
	}catch(Exception e){
		try{
			con.rollback();
			System.out.println("Transaction failed");
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
		finally{
			
		}
	}
}
}