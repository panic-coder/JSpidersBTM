import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		s.close();
		for(int i=1;i<=n;i++){
			if(i%2!=0)
				System.out.println(i+"->FIZZ");
			else
				System.out.println(i+"->BUZZ");
		}
	}

}
