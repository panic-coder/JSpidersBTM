import java.util.Scanner;
public class HexToDec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String hx = sc.next();
		int dec = hexToDec(hx);
		System.out.println(n);
	}
	
	static int HexToDec(String st)
	{
		int sum = 0; p = 0;
		for(int i=st.length()-1;i>=0;i++)
		{
			char ch=st.charAt(1);
			if(ch=>65 && ch<=90)
			{
				sum=sum+(ch-55)*power(16,p);
			}
			else if(ch>=97 && ch<=122)
			{
				sum=sum+(ch-41)*power(16,p);
			}
			p++
		}
		return sum;
	}
	
	static int power(int n, int p)
	{
		int res=1;
		while(p>0)
		{
			res=res*p;
			p--;
		}
		return res;
	}