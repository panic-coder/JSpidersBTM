class PatternRightAngleTriangleA_O
{
	public static void main(String args[])
	{
		int i,j;char ch = 'A';
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{	
				System.out.print(ch+" ");
				
				ch++;
				/*if(k==10)
					k=1;*/
			}
			System.out.println();
		}
		
	}
}