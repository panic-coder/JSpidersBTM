package techm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class ManageEmployee {
	
	ArrayList<Employee> emps = new ArrayList<Employee>();
	
	void addEmployees(Employee e){
		emps.add(e);
	}
	
	boolean removeEmployee(){
		System.out.println("Enter the employee id to remove:");
		Scanner s = new Scanner(System.in);
		int id=s.nextInt();
		Iterator<Employee> it = emps.iterator();
		
		while(it.hasNext()){
			Employee emp=it.next();
			if(emp.getEmpid()==id){
				emp.getLaptop().setStatus("not assigned");
				emps.remove(emp);
				return true;
			}
		}
		
		return false;
	}
	
	void display(){
		for(Employee e:emps){
			System.out.println(e);
		}
	}
}
