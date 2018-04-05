package techm;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ManageEmployee me = new ManageEmployee();
		while(true){
		Scanner s = new Scanner(System.in);
		
		System.out.println("a.add Details: ");
		System.out.println("b.display Details");
		System.out.println("c.remove Details");
		System.out.println("d.exit: ");
		
		char ch=s.next().charAt(0);
		
		switch (ch) {
		case 'a':/*System.out.println("1.enter employee and laptop details: ");
				 System.out.println("2.assign laptop to an employee");*/
				 System.out.println("Enter employee name, id, dept");
				 String name=s.next();
				 int id=s.nextInt();
				 String dept=s.next();
				 
				 System.out.println("Enter laptop id, hostname, make");
				 String lid=s.next();
				 String hname=s.next();
				 String make=s.next();
				 
				 try{
					 Laptop l=new Laptop(lid, hname, make, "not assigned");
					 Employee e = new Employee(id,name,dept,l);
					 e.getLaptop().setStatus("Assigned");
					 me.addEmployees(e);
				 }
				 catch(Exception e){
					 System.out.println("Fails to add");
					 break;
				 }
				 
				 System.out.println("Successfully Added");
				 
			break;
		
		case 'b':System.out.println("----Employee Information----");
				 me.display();
			
			break;
			
		case 'c':me.removeEmployee();
			
			break;

		case 'd':
				try{
				FileOutputStream fout = new FileOutputStream("F://techm//deatils.txt");
				 ObjectOutputStream out = new ObjectOutputStream(fout);
				 //System.out.println();
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
				System.out.println("Thank You");
			break;

		default:System.out.println("Invalid Option");
			break;
		}
	}
	}

}