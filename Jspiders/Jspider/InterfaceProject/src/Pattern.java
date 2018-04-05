import java.util.Scanner;

public class Pattern 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		  int num;
		  num = s.nextInt();
		  rectanglePatternPrint(num);
		   
	}

	public static void rectanglePatternPrint(int num) {
		int i,j,n=1;
		for(i=1;i<=num+1;i++)
		   {
		      for(j=1;j<=num;j++)
		      {
		         if(i>=2 && i<=num && j==(num+1)/2)
		         {
		             System.out.print(n);
		             n++;
		         }
		         else
		            System.out.print(num);

		      }
		      System.out.println();
		   }
		
	}

}
