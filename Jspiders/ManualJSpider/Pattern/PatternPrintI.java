class PatternPrintI
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<i;j++)
				System.out.print(i);
			System.out.println();
		}
		
	}
}