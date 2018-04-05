class Six
{
	public static void main(String args[])
	{
		int i,j,k=0,l;
		for(i=1;i<=5;i++)
		{
			for(l=1;l<=5-i;l++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
			{	
				System.out.print(k%9+1);
				k++;
				/*if(k==10)
					k=1;*/
			}
			System.out.println();
		}
		
	}
}