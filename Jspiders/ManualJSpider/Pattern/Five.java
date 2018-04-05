class Five
{
	public static void main(String args[])
	{
		int i,j,c=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{	
				System.out.print(c%2);
				c++;
				/*if(k==10)
					k=1;*/
			}
			
			if(i%2==0)
				c=1;
			else
				c=0;
			System.out.println();
		}
		
	}
}