package TEST;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {Scanner s= new Scanner(System.in);
	System.out.println("enter rows");
	int r=s.nextInt();
	System.out.println("enter col");
	int c=s.nextInt();
	int[][] mat=new int[r][c];
	System.out.println("elements");
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat[i].length; j++) {
			mat[i][j]=s.nextInt();
		}

	}
	int j=r-1;
	for(int i=0;i<r;i++){
		for (int k =i; k <j; k++) 
			System.out.print(mat[i][k]);
		for (int k =i; k <j; k++) 
			System.out.print(mat[k][j]);
		for (int k =j; k>i; k--) 
			System.out.print(mat[j][k]);
		for (int k =j; k>i; k--) 
			System.out.print(mat[k][i]);

		j--;
	}
	if(r%2==0)
	
	System.out.println(mat[r/2][r/2]);}
}
