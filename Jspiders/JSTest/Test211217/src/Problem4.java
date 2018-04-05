import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the size");
		int n = 7;
		int c;
		c=n/2;
		
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		
		s.close();
		
		repeat(a,c);
	}

	public static void repeat(int[] a,int c) {
		int t=0;
		for(int i=0;i<c;i++){
			t=a[i];
			a[i]=a[i+c+1];
			a[i+c+1]=t;
			
		}
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
		
}
