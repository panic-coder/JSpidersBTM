package com.mycompany.zombie;

public class DemoClass {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver"); //loading driver class
			System.out.println("Driver class loaded");
		}catch(ClassNotFoundException e){
			System.out.println("Driver class not found");
		}
	}

}
