import java.util.Scanner;
public class DecimalToHexadecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		String b = isHexa(n);
		System.out.println(n+" HexaDecimal is "+b);
	}
	
	static String isHexa(int n)
	{
		String hx=""; int b;
		while(n!=0)
		{
		
			b=n%16;
			if(b<10)
				hx = b+hx;
			else
				hx = (char)(b+55) + hx;
			n=n/10;
		}
		return hx;
		
	}
}