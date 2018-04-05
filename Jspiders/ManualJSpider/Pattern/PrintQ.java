import java.util.Scanner;
class PrintQ
{
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            
            System.out.println("Enter the number:");
            int n=s.nextInt();
			display(n);
		}
		static void display(int n){
		for (int j=0;j<n;j++)
			{
			for(int i=0;i<n;i++)
				if ((j==0 || j==3*n/4) && i<=3*n/4 || (i==0||i==3*n/4) && j<=3*n/4 || (i==j && i>=n/2))
				{
				
				System.out.print("*");
				}
				else
					System.out.print(" ");
				
			System.out.println();
			}
}			
}