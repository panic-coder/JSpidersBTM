import java.util.Scanner;
public class DateMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter 1st date dd mm yy");
		Date d1 = new Date(s.nextInt(), s.nextInt(), s.nextInt());
		
		System.out.println(" Enter 2nd date dd mm yy");
		Date d2 = new Date(s.nextInt(), s.nextInt(), s.nextInt());
		
		s.close();
		
		System.out.println("Number of days = "+(d2.numberOfDays()-d1.numberOfDays()));
		
		
	}

}
