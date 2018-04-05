package practice;

public class One {

	public static void main(String[] args) {
		int n=5,j,k=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(j=k+1;j<k+i;j++)
				{
					System.out.print(j+"*");		
				}
					System.out.println(j++);

				k=j;
			}
			else
			{
				k=k+i-1;
				for(j=k;j>k-i+1;j--)
					System.out.print(j+"*");
				System.out.println(j);
			}
		}
	}

}
