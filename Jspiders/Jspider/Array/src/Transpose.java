import java.util.Scanner;
public class Transpose {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m,n;
		System.out.println("Enter the size of array");
		m=s.nextInt();
		n=s.nextInt();
		
		int a[][]=new int[m][n];
		
		System.out.println("Enter total elements "+(m*n)+" for the matrix");
		
		for(int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				a[i][j]=s.nextInt();
			}
		}
		
		s.close();
		
		System.out.println("The array is ");
		for(int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		transpose(a);
		
		System.out.println("Transpose is ");
		for(int i=0;i<m;i++){
			for (int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
	}

	public static void transpose(int[][] a) {
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int t =a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
	}
	
	

}
