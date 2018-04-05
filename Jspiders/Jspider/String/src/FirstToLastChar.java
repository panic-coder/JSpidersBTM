import java.util.Scanner;
public class FirstToLastChar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st=s.nextLine();
		s.close();
		String str=swap1stLast(st);
		System.out.println(str);
	}

	private static String swap1stLast(String st) {
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '){
				int f=i;
				while(i<ch.length && ch[i]!=' '){
					i++;
				}
				
				char t=ch[f];
				ch[f]=ch[i-1];
				ch[i-1]=t;
			}
		}
		return new String(ch);
	}

	

}
