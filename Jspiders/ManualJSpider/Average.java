import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c; double average;
		System.out.println("Enter 3 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		average = (a+b+c)/3;
		System.out.println("Average of "+a+", "+b+" & "+c+" is "+average);
	}
}