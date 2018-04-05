
public class Array2d {
	public static void main(String[] args) {
		int [][]mat = {{2,3,4},{34,56},{8,7,6,5}};
		
		System.out.println(" No. of rows : "+mat.length);
		System.out.println(" No. of elements in 1st row : "+mat[0].length);
		System.out.println(" No. of elements in 2nd row : "+mat[1].length);
		System.out.println(" No. of elements in 3rd row : "+mat[2].length);
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
}
