package Test;

public class Pattern1 {
	
	

	public static void main(String[] args) {
		int n=7;
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				if(j==1||j==st)
				System.out.print("*");
				else
					System.out.print(" ");
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
