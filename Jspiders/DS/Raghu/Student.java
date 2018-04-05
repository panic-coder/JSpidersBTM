import java.util.Scanner;
public class Student implements Comparable {
	private int sid;
	private String sname;
	private int m1,m2,m3,m4;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	public int getTotal()
	{
		int total=m1+m2+m3+m4;
		return total;
	}
	public double getPerc()
	{
		double perc=getTotal()/4.0;
		return perc;
	}
	public String getGrade()
	{
		double perc=getPerc();
		if(perc>=90)
		{
			return "Distinction";
		}
		else if(perc<90 && perc>=60)
		{
			return "First";
		}
		else if(perc<60 && perc>=40)
		{
			return "PASS";
		}
		return "FAIL";
	}
	public static Student getStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no:");
		int roll=sc.nextInt();
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter Four Subject marks:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		Student s=new Student(roll, name, m1, m2, m3, m4);
		return s;
	}
	public Student(int sid, String sname, int m1, int m2, int m3, int m4) {
		this.sid = sid;
		this.sname = sname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	@Override
	public String toString() {
		return "Name=" + sname +" Roll No=" + sid + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4
				+ ", Total=" + getTotal() + ", perc=" + getPerc() + " Grade="+getGrade();
	}
	@Override
	public int compareTo(Object arg0) 
	{
		Student s1=(Student)arg0;
		return this.sid-s1.sid;
	}
	

}
