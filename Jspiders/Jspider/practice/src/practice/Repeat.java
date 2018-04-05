package practice;

import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size,c=0,t = 0;
		size = s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]==a[j])
					c++;
			}
			if(c>a.length/2)
				t=a[i];
		}
		
		if(c>a.length/2)
			System.out.println(t);
		else
			System.out.println("-1");
	}

}
