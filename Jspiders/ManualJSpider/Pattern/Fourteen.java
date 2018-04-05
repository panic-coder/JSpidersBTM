class Fourteen
{
	public static void main(String args[])
	{
		int i,j,l; char ch = 'a';
		for(i=1;i<=5;i++)
		{
			ch = 'a';
			for(l=1;l<=5-i;l++)
				System.out.print(" ");
			
			for(j=1;j<=2*i-1;j++)
			{	
				
					System.out.print(ch);
					ch++;
				
				/*if(k==10)
					k=1;*/
			}
					
	
			System.out.println();
		}
		
	}
}