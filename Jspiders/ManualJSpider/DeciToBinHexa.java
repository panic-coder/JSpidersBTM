import java.util.Scanner;

public class DeciToBinHexa
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Enter 1 for binary 16 for Hexa");
		int m = sc.nextInt();
		
		if(m==1)
		{
			String b = isBinary(n);
			System.out.println(b+" is  Binary for "+n);
		}
		
		else if(m==8)
		{
			String b = isHexa(n);
			System.out.println(n+" HexaDecimal is "+b);
		}
	}
	
	static String isBinary(int n)
	{
		String bin = "";int b;
		while(n!=0)
		{
			b=n%2;
			bin=b+bin;
			n=n/2;
		}
		return bin;
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