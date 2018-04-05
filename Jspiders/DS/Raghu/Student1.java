package TEST;
public class Student1 implements Comparable{
	String name;
	int sid;
	int age;
	double perc;
	public Student1(String name,int sid,int age,double perc) {
		this.name=name;
		this.sid=sid;
		this.age=age;
		this.perc=perc;
	}
	
	public String toString() {
		return "Student1 [name=" + name + ", sid=" + sid + ", age=" + age + ", perc=" + perc + "]";
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
