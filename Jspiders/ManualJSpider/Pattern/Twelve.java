class Twelve
{
	public static void main(String args[])
	{
		int i,j,l,m;
		for(i=1;i<=5;i++)
		{
			/*for(l=1;l<=5-i;l++)
				System.out.print(" ");*/
			m=1;
			for(j=1;j<=2*i-1;j++)
			{	
				if(j==1){
					System.out.print(m);
				m++;}
				else if(j==3){
					System.out.print(m);
					m++;
				}
				else if(j==5){
					System.out.print(m);
					m++;
				}
				else if(j==7){
					System.out.print(m);
					m++;
				}
				else if(j==9){
					System.out.print(m);
					m++;
				}
				else
					System.out.print("*");
				
				/*if(k==10)
					k=1;*/
			}
					
	
			System.out.println();
		}
		
	}
}