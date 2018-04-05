package com.mycompany.zombie;
import java.sql.*;
import java.util.Scanner;
public class ScanInsert{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int eid,salary;
		String ename,dept;
		System.out.println("Enter Employee id, Employee name, Salary and Department");
		eid = s.nextInt();
		ename = s.next();
		salary = s.nextInt();
		dept = s.next();
		s.close();
		final String URL= "jdbc:mysql://localhost:3306?user=root&password=root";
		String query = "insert into test.Employee values ("+eid+", '"+ename+"',"+salary+",'"+dept+"')";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL);
			Statement stmt = con.createStatement();
			stmt.execute(query);
			System.out.print(stmt.getUpdateCount());
			stmt.close();con.close();
			System.out.println(" Data Operation Success");
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
