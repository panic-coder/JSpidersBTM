import java.util.Scanner;

public class _6Prime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check for prime");
		int n = s.nextInt();
		s.close();
		prime(n);
	}

	public static void prime(int n) {
		int k=0;
		for(int i=3;i<=n;i++){
			for(int j=2;j<i;j++){
				
				if(i%j==0){
					k=0;
					break;
				}
				else{
					k=1;
				}
			}
			if(k==1)
				System.out.println(i+" ");
		}
	}
}
