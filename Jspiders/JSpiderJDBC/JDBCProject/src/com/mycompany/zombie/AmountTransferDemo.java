package com.mycompany.zombie;
import java.sql.*;
import java.util.Random;

import com.mycompany.zombie.PropertyReaderUtility;
public class AmountTransferDemo {
	public static void main(String[] args) {
		
	
	String driver=PropertyReaderUtility.getPropertyVal("driver");
	String url=PropertyReaderUtility.getPropertyVal("url");
	String pwd=PropertyReaderUtility.getPropertyVal("password");
	String user=PropertyReaderUtility.getPropertyVal("user");
	String qry1="update test.Student set balance = balance-2000 where Account = 601";
	String qry2="update test.Student set balance = balance+2000 where Account = 602";
	
	Random r = new Random(500000);
	int rn = r.nextInt();
	Connection con=null;
	try{
		Class.forName(driver);
		con=DriverManager.getConnection(url,user,pwd);
		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		stmt.executeUpdate(qry1);
		
		stmt.executeUpdate(qry2);
		
		System.out.println("Success");
		System.out.println("Transaction id "+rn);
		con.commit();
		
		
		
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