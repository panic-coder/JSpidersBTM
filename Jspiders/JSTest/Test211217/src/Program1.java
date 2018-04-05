import java.util.Scanner;
public class Program1 {
	Scanner sc = new Scanner(System.in);
	public int[] readArr()
	{
		System.out.println("enter the no. values:");
		int n = sc.nextInt();
		int ar[]= new int[n];
		System.out.println("enter" +n+ "integer values");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}

		return ar;		
	}
	void displayArr(int ar[])
	{
		System.out.println("entered values are");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	public void secondlar(int[] ar)
	{
		int largest = ar[0];
		int secondLargest = ar[0];

		for (int i = 0; i < ar.length; i++) 
		{
			 
			if (ar[i] > largest)
			{
				secondLargest = largest;
				largest = ar[i];
 
			} 
			else if (ar[i] > secondLargest)
			{
				secondLargest = ar[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("\n largest number is:" + largest);
 
	}
	public int[] duplicate(int ar[])
	{
		int n=ar.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (ar[i]==ar[j])
				{
					ar[j]=ar[n-1];
					n--;
					j--;
				}
			}
		}
		int na[]=new int[n];
		for (int i=0;i<n;i++)
		{
			na[i]=ar[i];
		}
		return na;
	}

}