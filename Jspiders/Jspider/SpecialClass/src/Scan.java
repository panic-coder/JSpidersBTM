import java.util.Scanner;
public class Scan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = s.nextInt();
		
		System.out.println("Value is "+x);
		
		System.out.println("Enter the line");
		String g = s.next();
		System.out.println(g);
	}

}
