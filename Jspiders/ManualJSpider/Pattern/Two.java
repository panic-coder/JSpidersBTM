import java.util.Scanner;
class Two
{
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            
            System.out.println("Enter the number:");
            int n=s.nextInt();
			display(n);
		}
		static void display(int n){
		char ch ='A';
		for (int i=1;i<=n;i++)
			{
			for(int j=1;j<=i;j++)
			{	
				System.out.print(ch+" ");
				
			}
			ch++;
			System.out.println();
		}
}			
}