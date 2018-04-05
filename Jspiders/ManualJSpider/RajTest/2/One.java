import java.util.*;
public class One{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int a[]=new int[n];
		
		for(int i =0;i<a.length;i++)
			a[i]=s.nextInt();
		
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
	}
}