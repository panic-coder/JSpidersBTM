import java.util.Scanner;

public class IncrementPattern {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int m = s.nextInt();
	incrementPatternPrint(n,m);
}

public static void incrementPatternPrint(int n, int m) {
	for(int i=n;i<=n+m-1;i++){
		for(int j=n;j<=i;j++){
			System.out.print(i);
		}
		System.out.println();
	}
	for(int i=n+m-1;i>=n;i--){
		for(int j=i;j>=n;j--){
			System.out.print(i);
		}
		System.out.println();
	}
	
}
}

