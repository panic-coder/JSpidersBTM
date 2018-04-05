import java.util.*;

class Array
{
	Scanner sc = new Scanner(System.in);
	public int[] read(){
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		//sc.close();
		return a;
	}
	
	public void display(int a[]){
		System.out.println("The array is");
		for(int i = 0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	public void displayReverse(int a[]){
		System.out.println("The reverse array is");
		for(int i = 0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	public double average(int a[]){
		double sum=0;
		for(int i=0;i<a.length;i++)
			sum = sum+a[i];
		return sum/a.length;
	}
	
	
	public int largest(int a[]){
		int l=a[0];
		for(int i=1;i<a.length;i++){
			if(l<a[i]){
				l=a[i];
			}
		}
		return l;
	}
	
	public int smallest(int a[]){
		int l=a[0];
		for(int i=1;i<a.length;i++){
			if(l>a[i]){
				l=a[i];
			}
		}
		return l;
	}
	
	public int evenOdd(int a[]){
		int c=0;
		for(int i = 0;i<a.length;i++){
			if(a[i]%2==0)
				c++;
		}
		return c;
	}
	
	/*public int search(int a[],int b){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to search");
		//int b = s.nextInt();
		int i,k=0;
		s.close();
		for(i = 0;i<a.length;i++){
			if(a[i]==b){
				k++;
			}
		}
		return k;
	}*/

	public int search(int[] a, int b) {
		
		int i,k=0;
		
		for(i = 0;i<a.length;i++){
			if(a[i]==b){
				k++;
			}
		}
		return k;
	}

	public int SearchInput() {
		//Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to search");
		int n=sc.nextInt();
		//s.close();
		return n;
	}

	public int prime(int[] a) {
		int c,d=0;
		for(int i=0;i<a.length;i++){
			c=0;
			for(int j=1;j<=a[i]/2;j++){
				if(a[i]%j==0){
					c++;
				}
			}
			if(c==1){
				d++;
			}
		}
		return d;
	}

	public int evenSum(int[] a) {
		int sum=0;
		for(int i = 0;i<a.length;i++){
			if(a[i]%2==0){
				sum=sum+a[i];
			}
		}
		return sum;
	}

	public int[] reverse(int[] a) {
		int temp=0;
		for(int i=0;i<a.length/2;i++){
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
			
		return a;
	}
	
	

	
	

}
