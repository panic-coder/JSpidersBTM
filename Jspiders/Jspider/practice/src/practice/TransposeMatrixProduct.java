package practice;

import java.util.Scanner;

public class TransposeMatrixProduct {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int initial,m,n;
		initial = s.nextInt();
		m = s.nextInt();
		n = s.nextInt();
		int a[][] = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=initial;
				initial++;
			}
		}
		int at[][] = new int[n][m];
		at = transpose(a,m,n);
		
		
		
		int am[][] = new int[m][m];
		
		am = multiply(a,at,m,n);
		
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				System.out.print(am[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
		
	}

	private static int[][] multiply(int[][] a, int[][] at,int m,int n) {
		int am[][] = new int[m][m];
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				am[i][j]=0;
				for(int k=0;k<n;k++){
					am[i][j]=am[i][j]+(a[i][k]*at[k][j]);  
				}
			}
		}
		return am;
	}

	private static int[][] transpose(int[][] a,int m,int n) {
		int at[][] = new int[n][m];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				at[j][i]=a[i][j];
			}
		}
		return at;
	}
	
}
