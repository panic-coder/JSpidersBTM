package TEST;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.next();
		removdup(st);

	}

	private static void removdup(String st) {
		char ch[]=st.toCharArray();

		int n=ch.length;
		for (int i = 0; i <n; i++)
		{
			for (int j = i+1; j <n; j++)
			{
				if(ch[i]==ch[j])
				{
					ch[i]=ch[n-1];
					ch[j]=ch[n-2];
					n--;
					n--;
				}

			}
			
			}
		char[] c=new char[n];
		for (int j = 0; j <n; j++) {
			c[j]=ch[j];
			System.out.println(c[j]);

		}
		System.out.println(new String(c));
	}
}
