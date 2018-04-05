package TEST;
public class Employee implements Comparable {
	String ename;
	int eid;
	double sal;
	int age;
	public Employee(String ename,int eid,double sal,int age) {
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", sal=" + sal + ", age=" + age + "]";
	}
	public int hashCode()
	{
		return age;
	}

	public int compareTo(Object ob)
	{
		if(this.hashCode()>ob.hashCode())
			return 1;
		else
			return -1;
	}

	
}
