class Eleven
{
	public static void main(String args[])
	{
		int i,j,l;
		for(i=1;i<=5;i++)
		{
			for(l=1;l<=5-i;l++)
				System.out.print(" ");
			
			for(j=1;j<=2*i-1;j++)
			{	
				if(j%2==0){
					System.out.print("0");
				}
				
				else
					System.out.print("1");
				
				/*if(k==10)
					k=1;*/
			}
					
	
			System.out.println();
		}
		
	}
}