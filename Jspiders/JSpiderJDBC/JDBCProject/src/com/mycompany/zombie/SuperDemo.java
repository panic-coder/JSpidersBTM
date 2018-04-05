package com.mycompany.zombie;
import java.sql.*;
public class SuperDemo {
	public static void main(String[] args) {
		final String URL= "jdbc:mysql://localhost:3306?user=root&password=root";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL);
			System.out.println("Connnection Success");
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
