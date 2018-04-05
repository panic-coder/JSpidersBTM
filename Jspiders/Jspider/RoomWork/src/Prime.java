import java.io.*;
public class Prime {
	public static void main(String[] args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int i,count=0;
	float n;
	System.out.println("Enter the number");
	n=Float.parseFloat(br.readLine());
	for(i=0;i<=n;i++){
		if(n%i==0)
			count++;
	}
	
	if(count==2)
		System.out.println(n+" is prime");
	else
		System.out.println(n+" is not prime");
	
	
	}

}
