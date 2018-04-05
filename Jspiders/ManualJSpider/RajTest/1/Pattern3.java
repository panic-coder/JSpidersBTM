
public class Pattern3{
	public static void main(String args[])
	{
		
		int n = 5;
		int sp = n/2, st=1,i; 
		for(i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int k = 1;
			
			for(int j=1;j<=st;j++)
			{	
				if(j==1)
					System.out.print(k+" ");
				else if(j==st)
					System.out.print(k+" ");
				else if(j%2==0)
					System.out.print(k+1+" ");
				else if(j%2!=0 && j>1)
					System.out.print(k+2+" ");
				
			}
			System.out.println();
			if(i<=n/2)
			{
				sp=sp-1;
				st=st+2;
			}
			else
			{
				sp=sp+1;
				st=st-2;
			}
		}
	}
}
		
