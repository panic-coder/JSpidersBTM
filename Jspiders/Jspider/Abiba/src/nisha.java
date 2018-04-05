import java.util.Scanner;
public class nisha {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your bday date");
		int n = s.nextInt();
		s.close();
		switch(n){
		case 5:System.out.println("Talk to Deepak");
		break;
		default:System.out.println("I know your bday is on 5");
		break;
		}
	}
}
