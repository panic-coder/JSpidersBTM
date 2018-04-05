import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentRunner 
{
	TreeSet t=new TreeSet();
	public boolean add(Student s)
	{
		t.add(s);
		return true;
	}
	public void display()
	{
		System.out.println("<===============STUDNET RESULT SHEET==============>");
		System.out.println("RollNo Name PHY CHE MAT BIO TOTAL PERCENTAGE RESULT");
		System.out.println("====================================================");
		for(Object ob:t)
		{
			System.out.print(ob);
		}
	}
	public void getReport(int rollno)
	{
		Student s=null;
		for(Object ob:t)
		{
			if(((Student)ob).getSid()==rollno)
			{
				s=(Student)ob;
			}
			
		}
			if(s==null)
			{
				System.out.println("Result Not Found");
				return;
			}
			System.out.println("Report-Card");
			System.out.println("NAME:"+s.getSname());
			System.out.println("RollNO:"+s.getSid());
			System.out.println("SUB MAX MIN OBT CLASS-MAX");
			System.out.println("PHY 100 40 "+s.getM1()+" "+maxPhy());
			System.out.println("PHY 100 40 "+s.getM2()+" "+maxChe());
			System.out.println("PHY 100 40 "+s.getM3()+" "+maxMat());
			System.out.println("PHY 100 40 "+s.getM4()+" "+maxBio());
			System.out.println("Total 400 160"+s.getTotal()+" "+highestTotal());
			System.out.println("PERCENTAGE:"+s.getPerc());
			System.out.println("RESULT:"+s.getGrade());
			System.out.println("RANK:"+getRank(rollno));
		}
	private int highestTotal() 
	{
		int marks=0;
		for(Object obj:t)
		{
			int m=((Student)obj).getTotal();
			if(m>marks)
			{
				marks=m;
			}
		}
		return marks;
	}
	private int maxPhy()
	{
		int marks=0;
		for(Object obj:t)
		{
			int m=((Student)obj).getM1();
			if(m>marks)
			{
				marks=m;
			}
		}
		return marks;
	}
	private int maxChe()
	{
		int marks=0;
		for(Object obj:t)
		{
			int m=((Student)obj).getM2();
			if(m>marks)
			{
				marks=m;
			}
		}
		return marks;
	}
	private int maxMat()
	{
		int marks=0;
		for(Object obj:t)
		{
			int m=((Student)obj).getM3();
			if(m>marks)
			{
				marks=m;
			}
		}
		return marks;
	}
	private int maxBio()
	{
		int marks=0;
		for(Object obj:t)
		{
			int m=((Student)obj).getM4();
			if(m>marks)
			{
				marks=m;
			}
		}
		return marks;
	}
	private double getPercentage(int rollno)
	{
		double perc=0.0;
		for(Object obj: t)
		{
			if(((Student) obj).getSid()==rollno)
			{
				perc=((Student) obj).getPerc();
			}
		}
		return perc;
	}
	private int getRank(int rollno)
	{
		int rank=1;
		double perc=getPercentage(rollno);
		for(Object obj:t)
		{
			if(perc<((Student)obj).getPerc())
			{
				rank++;
			}
		}
		return rank;
	}
}
