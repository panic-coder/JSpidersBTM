import java.util.Scanner;
public class Problem6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the size");
		int n = 6,m = 8; 
		int a[]=new int[n];
		int b[]=new int[m];
		//int c[]=new int[m+n];
		System.out.println("Enter "+n+" numbers for 1st array");
		
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter "+n+" numbers for 2st array");
		
		for(int i=0;i<m;i++){
			b[i]=s.nextInt();
		}
		
		s.close();
		
		System.out.println();
		
		zigzag(a,b);
	}

	public static void zigzag(int[] a, int[] b) {
		
		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++){
			for(int j=0;j<a.length;j++){
				c[i]=a[j];
			}
		}
	}
}

