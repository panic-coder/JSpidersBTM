import java.util.Scanner;
public class BiggestFromDiagonal {
	
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
			
			int b[]=biggestDiagonal(a);
			
			System.out.println("Biggest in Diagonal is ");
			for(int i=0;i<2;i++){
				
				System.out.println(b[i]);
			}
		
			
		}
		
		
		public static int[] biggestDiagonal(int a[][]){
			int big[]=new int[2];
			big[0]=big[1]=a[a.length/2][a.length/2];
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length/2;j++){
					if(i==j){
						if(big[0]<a[i][j])
							big[0]=a[i][j];
					}
					if(i+j==a.length-1){
						if(big[1]<a[i][j])
							big[1]=a[i][j];
					}
				}
			}
			return big;
		}

	}



