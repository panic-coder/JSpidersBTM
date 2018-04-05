class RightTriangle
{
	public static void main(String args[])
	{
		int i,j,l,c = 1;
		for(i=1;i<=4;i++)
		{
			for(l=1;l<=4-i;l++)
				System.out.print("  ");
			for(j=1;j<=i;j++)
			{	
				System.out.print(c+" ");
				
				c++;
				/*if(k==10)
					k=1;*/
			}
			System.out.println();
		}
		
	}
}