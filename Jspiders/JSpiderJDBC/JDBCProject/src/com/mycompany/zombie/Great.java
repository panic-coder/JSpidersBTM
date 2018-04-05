package com.mycompany.zombie;
import java.util.Scanner;
public class Great {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the country name");
		String Country=s.nextLine();
		s.close();
		System.out.println(Country+" is Great");
	}

}
