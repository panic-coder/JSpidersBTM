import java.util.Scanner;
public class Marks
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int m1,m2,m3,m4;
		double m;
		System.out.println("Enter marks of 4 subjects");
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		m4 = s.nextInt();
		m = (m1+m2+m3+m4)/4;
		if(m1<35||m2<35||m3<35||m4<35)
			System.out.println("Failed");
		else if(m>=80)
			System.out.println("Distinction");
		else if(m>=60)
			System.out.println("First Division");
		else if(m>=50)
			System.out.println("Second Division");
		else if(m>=35)
			System.out.println("Passed");
	}
}