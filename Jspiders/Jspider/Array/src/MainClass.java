
public class MainClass {


		public static void main(String[] args) {
			Array o = new Array();
			int a[] = o.read();
			o.display(a);
			
			double average = o.average(a);
			System.out.println("Average is "+average);
			
			int l = o.largest(a);
			System.out.println("Largest is "+l);
			
			int s = o.smallest(a);
			System.out.println("Smallest is "+s);
			
			int rev[]=o.reverse(a);
			o.displayReverse(rev);
			
			int n = o.evenOdd(a);
			int m = a.length-n;
			System.out.println("Number of even "+n+" and number of odd "+m);
			
			int q = o.SearchInput();
			int p = o.search(a,q);
			if(p==1)
				System.out.println("Searched number is present");
			else 
				System.out.println("Searched number is not present");
			
			int r = o.prime(a);
			System.out.println("Number of prime is "+r);
			
			int t = o.evenSum(a);
			System.out.println("Sum of even numbers "+t);
			
			
		}
}
