package techm;

public class Employee {
	private int empid;
	private String empName;
	private String dept;
	private Laptop laptop;
	public Employee(int empid, String empName, String dept, Laptop laptop) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.dept = dept;
		this.laptop = laptop;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", dept=" + dept + ", laptop=" + laptop + "]";
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
	
}
