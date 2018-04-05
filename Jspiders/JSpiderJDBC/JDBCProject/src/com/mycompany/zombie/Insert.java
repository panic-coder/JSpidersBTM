package com.mycompany.zombie;
import java.sql.*;
public class Insert{
	public static void main(String[] args) {
		final String URL= "jdbc:mysql://localhost:3306?user=root&password=root";
		String query = "insert into test.employee values(511,'Keshav',1000,'Security')";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL);
			Statement stmt = con.createStatement();
			stmt.execute(query);
			//System.out.print(stmt.getUpdateCount());
			stmt.close();con.close();
			System.out.println(" Data Operation Success");
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
