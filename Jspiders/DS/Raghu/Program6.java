package TEST;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) 
	{
		System.out.println("enter num");
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
	numtoWords(n/10%1000, "thousand");
		numtoWords(n%100,"hundred");
		numtoWords(n,"");
		
	}

	private static void numtoWords(int n, String st) {
String one[]={"","ONE","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen", "fourten","fifteen","sixteen","seventeen","eighteen","nineteen"};		
	String two[]={"","","twenty","thirty","fourty","fifty","Sixty,Seventy","Eighty","ninety"};
	
	
	
	if(n<19){
		
	System.out.print(two[n/10] + " " +one[n%10]);
	
	}
	else{
		System.out.print(one[n]);
	}
	if(n>0)
		
		System.out.print(st+ " ");
	}
}
