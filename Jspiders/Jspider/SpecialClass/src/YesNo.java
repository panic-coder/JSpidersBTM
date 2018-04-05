import java.util.Scanner;
public class YesNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String conf;
		do{
			System.out.println("Enter the name");
			String name = s.next();
			System.out.println("Hello "+name);
			System.out.println("Will you enter more names");
			conf = s.next();
		}while(conf.equalsIgnoreCase("yes"));
		s.close();
	}

}
