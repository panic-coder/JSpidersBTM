package com.mycompany.zombie;

import java.sql.*;


public class BatchUpdateDemo {
	public static void main(String[] args) {
		String qry1 = "DELETE from test.student where Account =602 ";
		String qry2 = "UPDATE test.product set price = 40000 where pid = 7";
		String qry3 = "INSERT into test.employee values(505,'P',500,'Secretary')";
		
		try{Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		Statement stmt = con.createStatement();
		stmt.addBatch(qry1);
		stmt.addBatch(qry2);
		stmt.addBatch(qry3);
		
		int [] arr = stmt.executeBatch();
		System.out.println(arr[0] + " records are deleted");
		System.out.println(arr[1] + " records are updated");
		System.out.println(arr[2] + " records are inserted");
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
