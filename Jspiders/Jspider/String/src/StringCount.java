import java.util.Scanner;
public class StringCount {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st=s.nextLine();
		s.close();
		int str=count(st);
		System.out.println(str);
	}

	private static int count(String st) {
		int co=0;
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++){
			int c=0;
			while(i<ch.length && ch[i]==' '){
				c++;
				st=st+ch[i];
				i++;
			}
			
			co=co+c;
			/*if(c!=0)
				st=st+c;*/
		}
		return co;
	}

	

}
