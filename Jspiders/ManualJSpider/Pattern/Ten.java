class Ten
{
	public static void main(String args[])
	{
		int i,j,k,n=5; char ch ='A';
		for(i=1;i<=n;i++)
		{
			ch='A';
			for(j=1;j<=i-1;j++)
				System.out.print(" ");
			for(k=1;k<=2*n-(2*i-1);k++)
			{
				
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
	}
}