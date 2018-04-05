import java.io.*;
public class EvenOdd {
public static void main(String[] args)throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	
	int i;
	System.out.println("Enter a number");
	i=Integer.parseInt(br.readLine());
	if(i%2==0)
		System.out.println(i+" is even");
	else
		System.out.println(i+" is odd");
}
}
