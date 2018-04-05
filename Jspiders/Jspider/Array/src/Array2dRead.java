import java.util.Scanner;
public class Array2dRead {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		int r=s.nextInt();
		int c=s.nextInt();
		int mat[][] = new int[r][c];
		
		System.out.println("Enter "+(r*c)+" elements");
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				mat[i][j]=s.nextInt();
			}
		}
		System.out.println();
		System.out.println("The array is :");
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print(mat[i][j]+"("+i+","+j+") ");
			}
			System.out.println();
		}
		s.close();
	}

}
