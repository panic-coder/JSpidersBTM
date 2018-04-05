import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID");
		int id = sc.nextInt();
		System.out.println("Enter student name");
		String name = sc.next();
		System.out.println("Enter Student Percentage");
		double per = sc.nextDouble();
		System.out.println("\n*****STUDENT INFORMATION*****");
		System.out.println("Student ID : "+id);
		System.out.println("Student NAME : "+name);
		System.out.println("Student PERCENTAGE : "+per+"%");
	}
}
		