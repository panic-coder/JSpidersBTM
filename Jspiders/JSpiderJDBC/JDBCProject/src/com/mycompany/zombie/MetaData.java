package com.mycompany.zombie;
import java.sql.*;
public class MetaData {
	public static void main(String[] args) {
		String sqlQry = "Select * from test.student";
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		DatabaseMetaData dbMeta = con.getMetaData();
		System.out.println(dbMeta.getDatabaseProductName());
		System.out.println(dbMeta.getDriverName());
		System.out.println(dbMeta.getDriverVersion());
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sqlQry);
		ResultSetMetaData rsMeta = rs.getMetaData();
		
		System.out.println(rsMeta.getColumnCount());
		System.out.println(rsMeta.getColumnName(3));
		
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}
