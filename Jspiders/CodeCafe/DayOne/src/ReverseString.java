

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string ");
		String st=s.nextLine();
		String st1=isReverse(st);
		System.out.println(st1);
		s.close();
	}
		
			static String isReverse(String st)
			{
				char ch[]=st.toCharArray();
				st="";
				for(int i=0;i<ch.length;i++)
				{
					int j=i;
					while(i<ch.length && ch[i]!=' ')
					{
						i++;
					}
					int k=i-1;
					while(k>=j)
					{
						st=st+ch[k];
						k--;
					}
					if(i<ch.length)
						st=st+ch[i];
				}
				return st;
				}
}
