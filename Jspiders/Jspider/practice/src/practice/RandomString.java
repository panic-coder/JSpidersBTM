package practice;

import java.util.Random;
import java.util.Scanner;

public class RandomString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		while(n>0){
		
		String st=s.nextLine();
		char c[]=st.toCharArray();
		char result[] = new char[c.length];
		
		Random rn = new Random();
		
		for(int i=0;i<c.length;i++){
			result[i] = c[rn.nextInt(c.length)];
		}
		
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
		
		n--;
		}
		s.close();
	}
}
