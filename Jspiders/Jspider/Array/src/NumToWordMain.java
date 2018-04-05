import java.util.Scanner;
public class NumToWordMain {
	public static void main(String args[]){
		NumberToWords nw=new NumberToWords();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		nw.nTow(n/10000000%100, "Crore");
		nw.nTow(n/100000%100, "Lakh");
		nw.nTow(n/1000%100, "Thousand");
		nw.nTow(n/100%10, "Hundred");
		nw.nTow(n%100,"");
		s.close();
	}
}
