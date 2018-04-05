import java.io.*;
public class Palindrome {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int n,r,sum=0,N=0;
		System.out.println("Enter the number");
		n=Integer.parseInt(br.readLine());
		N=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(N==sum)
			System.out.println(N+" is Palindrome");
		else
			System.out.println(N+" is not Palindrome");
	}

}
