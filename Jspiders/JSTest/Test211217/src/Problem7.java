
	import java.util.Scanner;
	public class Problem7 {
		
		public static void main(String[] args) {
			Problem7 pp= new Problem7();
			int mt[][]=pp.readArr();
			pp.displayArr(mt);
			pp.arrsum(mt);
		}
		Scanner sc = new Scanner(System.in);
		public int[][] readArr()
		{
			System.out.println("enter the rows and coloums");
			int r = sc.nextInt();
			int c = sc.nextInt();
			int mat[][]= new int[r][c];
			System.out.println("enter " + (r*c) + " elements");
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{
					mat[i][j]=sc.nextInt();
				}
			}
			return mat;
		}

		void displayArr(int mat[][])
		{
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();

			}
		}
		void arrsum(int mat[][])
		{
			for(int i=0;i<mat.length;i++)
			{
				int rsum=0, csum=0;

				for(int j=0;j<mat[i].length;j++)
				{
					rsum+=mat[i][j];
					csum+=mat[j][i];

				}
				System.out.println(i+1+" row sum is "+rsum);
				System.out.println(i+1+" coloumn sum is "+csum);
			}

		}

	}

