import java.util.Scanner;
public class _7CountVowel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st;
		System.out.println("Enter the String");
		st=s.nextLine();
		s.close();
		vowel(st);
	}

	public static void vowel(String st) {
		
		
		int d=0;
		for(int i=0;i<st.length();i++){
			char c=st.charAt(i);
			//if(i==0 && c[i]!=' ' || c[i]!=' ' && c[i-1]==' '){
			if(c>='a' && c<='z'){
			if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u'){
				d++;
			}}
			
		}
		System.out.println("Number of vowels "+d);
	}
}
