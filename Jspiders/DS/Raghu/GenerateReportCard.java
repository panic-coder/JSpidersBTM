import java.util.Scanner;

public class GenerateReportCard {

	public static void main(String[] args) 
	{
		StudentRunner s=new StudentRunner();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add Student");
			System.out.println("2. Display Student");
			System.out.println("3. Generate Repoer-Card");
			System.out.println("Enter your Choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1: if(s.add(Student.getStudent()))
				System.out.println("Student information added Successfully");
			else
				System.out.println("Fails to add");
			break;
			case 2:
				s.display();
				break;
			case 3: System.out.println("Enter roll no:");
			int n=sc.nextInt();
			s.getReport(n);
			break;
			default:
				System.out.println("Not possible");
				return;
			}
		}
	}

}
