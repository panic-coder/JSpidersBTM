import java.util.*;
public class Two{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		System.out.println("Enter the place for new number");
		int np = s.nextInt();
		
		System.out.println("Enter the new number");
		int nn = s.nextInt();
		
		int ar[] = new int[a.length+1];
		
		for(int i=0;i<ar.length;i++){
			if(np>i)
			{
				ar[i]=a[i];
			}
			else if(np==i)
				ar[i]=nn;
			else if(np<i)
				ar[i]=a[i-1];
			
		}
		
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
			
	}
}