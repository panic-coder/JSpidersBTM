class Four
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{	
				if(j%2!=0)
					System.out.print("1");
				else if(j%2==0)
					System.out.print("0");
				
				
				/*if(k==10)
					k=1;*/
			}
			System.out.println();
		}
		
	}
}