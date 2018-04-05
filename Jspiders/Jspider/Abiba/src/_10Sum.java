import java.util.Scanner;
public class _10Sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two no.");
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		while(b>0){
			a++;
			b--;
		}
		System.out.println(a);
	}
}
