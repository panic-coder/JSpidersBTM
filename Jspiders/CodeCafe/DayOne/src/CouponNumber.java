import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter the number of coupons");
		int n = s.nextInt();
		int a[]=new int[n];
		s.close();
		int total_random = random(a);
		System.out.println("Total Random number for "+n+" elements should be "+total_random);
	}

	public static int random(int[] a) {
		int r,kk=a.length,k=0;
		Random rn = new Random();
		for(int i=0;i<a.length;i++){
			r = rn.nextInt(2);
			System.out.println(r);
			a[i]=r;
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					k++;
				}
			}
		}
		if(k>1){
			kk=kk+k;
		}
		return kk;
	}
}
