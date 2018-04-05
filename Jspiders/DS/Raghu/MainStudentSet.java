package TEST;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class MainStudentSet 
{
public static void main(String[] args) 
{
	TreeSet ts= new TreeSet();
	Scanner sc= new Scanner(System.in);
	String rs="Yes";
	do{
	System.out.println(" Enter Student id: ");
	int id=sc.nextInt();
	System.out.println(" Enter the name: ");
	String name=sc.next();
	System.out.println(" Enter the per: ");
	double per= sc.nextDouble();
	
	Student s=new Student(id, name, per);
	ts.add(s);
	
	System.out.println(" do you have more students: ");
	
	rs=sc.next();
	}while(rs.equalsIgnoreCase("yes"));
	System.out.println("<===========Students Information===========>");
	Iterator it= ts.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
}
}
