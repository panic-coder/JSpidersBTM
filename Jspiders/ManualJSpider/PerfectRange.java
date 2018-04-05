
public class PerfectRange
{
	public static void main(String args[])
	{
		
		int i,m,sum;
		
		for(i=0;i<=100;i++)
		{
		m=i;
		sum = isPerfect(i);
		
		if(m==sum)
			System.out.println(m);
		}
	}
	
	public static int isPerfect(int n)
	{
		int i,sum =0;
		for( i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum = sum + i;
		}
			
		return sum;
	}
}