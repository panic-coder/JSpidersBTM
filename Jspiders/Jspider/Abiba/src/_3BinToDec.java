import java.util.Scanner;
public class _3BinToDec {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a binary number");
		long n=s.nextLong();
		System.out.println("Enter a decimal number");
		int d=s.nextInt();
		s.close();
		long m = decimal(n);
		System.out.println("Decimal is "+m);
		String binary = tobinary(d);
		System.out.println("Binary is "+binary);
	}

	public static String tobinary(int d) {
		String s="";
		while(d>0){
			int r = d%2;
			s=s+r;
			d=d/2;
		}
		return s;
	}

	public static long decimal(long binary){
        
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                long tmp = binary%10;
                decimal=(int) (decimal+(tmp*Math.pow(2, power)));
                binary = binary/10;
                power++;
            }
        }
        return decimal;
	}
}
