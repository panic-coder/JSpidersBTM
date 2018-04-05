package practice;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String st1 = s.nextLine();
		String st2 = s.nextLine();
//		System.out.println(st1);
//		System.out.println(st2);
//		
		st1=removeSpace(st1);
		st2=removeSpace(st2);
		
		st1=toLowerCase(st1);
		st2=toLowerCase(st2);
		
		st1=sort(st1);
		st2=sort(st2);
		
		if(st1.equals(st2))
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are Not Anagram");
		
		s.close();
	}

	public static String sort(String st) {
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]>ch[j]){
					char c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			}
			st=st+ch[i];
		}
		//st = new String(ch); 
	//	System.out.println(st);
		return st;
	}

	public static String toLowerCase(String st) {
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]>=65 && ch[i]<=90){
				ch[i]=(char) (ch[i]+32);
				st=st+ch[i];
			}
			else
				st=st+ch[i];
		}
		//System.out.println(st);
		return st;
	}

	public static String removeSpace(String st) {
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' ')
				st=st+ch[i];
		}
		//System.out.println(st);
		return st;
	}
}
