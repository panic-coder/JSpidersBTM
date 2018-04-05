import java.util.Scanner;
public class CompareWithoutIf
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b,c,max;
		System.out.println("Enter 3 no.");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		//max = a>b?a:b;
		//max = max>c?max:c;
		max = (a>b && a>c)?a:(b>c)?b:c;
		System.out.println(max+" is bigger");
		//System.out.println(a>b?a:b);	
	}
}