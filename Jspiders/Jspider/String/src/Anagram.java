import java.util.Scanner;

class Anagram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st=s.nextLine();
		System.out.println("Enter the String");
		String st1=s.nextLine();
		s.close();
		int str=isAnagram(st,st1);
		if(str==1)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

	public static int isAnagram(String st,String st1) {
		//char[] ss=st.toCharArray();
		//char[] ss1=st.toCharArray();
		int k=0;
		String str=remove(st);
		String str1=remove(st1);
		/*if(str.length()!=str1.length()){
			k=1;
			return k;
		}*/
		char[] c=toLowercase(str);
		char[] c1=toLowercase(str1);
		char[] stt=sort(c);
		char[] stt1=sort(c1);
		/*for(int i=0;i<stt.length;i++)
			System.out.print(stt[i]);
		System.out.println();
		for(int i=0;i<stt1.length;i++)
			System.out.print(stt1[i]);
		System.out.println();*/
		for(int i=0;i<stt1.length;i++){
		if(stt[i]==stt1[i])
			k=1;
		}
		return k;
	}

	public static char[] sort(char[] s1) {
		for(int i=0;i<s1.length;i++){
			for(int j=i+1;j<s1.length;j++){
				if(s1[i]>s1[j]){
					char t=s1[i];
					s1[i]=s1[j];
					s1[j]=t;
				}
			}
		}
		/*for(int i=0;i<s1.length;i++)
			System.out.print(s1[i]);
		System.out.println();*/
		return s1;
	}

	public static char[] toLowercase(String s) {
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>=65 && ch[i]<=90){
				ch[i]=(char)(ch[i]+32);
			}
		}
		/*for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);
		System.out.println();*/
		return ch;
	}

	public static String remove(String st) {
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				st=st+ch[i];
			}
		}
		//System.out.println(st);
		return st;
	}
}