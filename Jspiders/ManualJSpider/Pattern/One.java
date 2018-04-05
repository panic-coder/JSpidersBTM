import java.util.Scanner;
class One
{
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            
            System.out.println("Enter the number:");
            int n=s.nextInt();
			display(n);
		}
		static void display(int n){
		for (int j=1;j<=n;j++)
			{
			for(int i=1;i<=j;i++)
				if (j%2==0)
				{
				
				System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				
			System.out.println();
			}
}			
}