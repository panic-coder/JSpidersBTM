import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String st=s.next();
		s.close();
		reverse(st);
	}

	public static void reverse(String st) {
		char[] c = st.toCharArray();
		int j=c.length;
		st="";
		for(int i=j-1;i>=0;i--){
			st=st+c[i];
		}
		System.out.println(st);
	}

}
