import java.util.Scanner;
public class Employee
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String post;
		System.out.println("Enter the post within CEO, Director, Manager, Supervisor, Worker for the resident");
		post = s.next();
		if(post.equalsIgnoreCase("ceo"))
			System.out.println("Bunglow with swimming pool");
		if(post.equalsIgnoreCase("director"))
			System.out.println("Bunglow with garden");
		if(post.equalsIgnoreCase("manager"))
			System.out.println("Duplex");
		if(post.equalsIgnoreCase("Supervisor"))
			System.out.println("3BHK Flat");
		if(post.equalsIgnoreCase("worker"))
			System.out.println("2BHK Flat");
	}
}