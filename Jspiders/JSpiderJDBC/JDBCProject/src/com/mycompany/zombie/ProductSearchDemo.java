package com.mycompany.zombie;
import java.util.*;
import java.sql.*;

public class ProductSearchDemo {
	public static void main(String[] args) {
		/*String driver=PropertyReaderUtility.getPropertyVal("driver");
		String url=PropertyReaderUtility.getPropertyVal("url");
		String user=PropertyReaderUtility.getPropertyVal("user");
		String pwd=PropertyReaderUtility.getPropertyVal("pwd");*/
		final String URL= "jdbc:mysql://localhost:3306?user=root&password=root";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id");
		int id=s.nextInt();
		String sqlQry = "select * from mysql.product where pid = "+id;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlQry);
			if(rs.next()){
				String name=rs.getString("pname");
				double price = rs.getDouble("price");
				System.out.println("Data is Present");
				System.out.println("Product Details");
				System.out.println("----------------");
				System.out.println(name+"   "+price);
			}else{
				System.out.println("no data found");
			}
			
			stmt.close();con.close();s.close();
			
			
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}
