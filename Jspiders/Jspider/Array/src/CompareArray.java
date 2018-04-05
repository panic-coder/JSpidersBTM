import java.util.Scanner;
public class CompareArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the size of array");
		n=s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		System.out.println("Enter the 1st array");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		
		System.out.println("Enter the 2nd array");
		for(int i=0;i<n;i++)
			b[i]=s.nextInt();
		
		s.close();
		boolean c=compare(a,b);
		System.out.println("The two array is "+c);
	}
	
	public static boolean compare(int[] a,int[] b){
		/*if(a.length!=b.length)
			return false;*/
		int n=b.length;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<n;j++){
				if(a[i]==b[j]){
					b[j]=b[n-1];
					n--;
					break;
				}
			}
		}
		return n==0;
	}
}

