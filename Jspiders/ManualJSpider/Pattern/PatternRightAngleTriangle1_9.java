class PatternRightAngleTriangle1_9
{
	public static void main(String args[])
	{
		int i,j,k=0;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{	
				System.out.print(k%9+1+" ");
				k++;
				/*if(k==10)
					k=1;*/
			}
			System.out.println();
		}
		
	}
}