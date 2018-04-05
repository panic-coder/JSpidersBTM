import java.util.Scanner;
public class PresentOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		System.out.println("Enter the String to be searched");
		String s2=s.nextLine();
		s.close();
		boolean rs=checkStr(s1,s2);
		if(rs)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean checkStr(String s1, String s2) {
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int j=0;
		for(int i=0;i<c1.length;i++){
			int k=i;
			while(k<c1.length && j<c2.length && c1[k]==c2[j]){
				k++;
				j++;
			}
		}
		if(j==c2.length)
			return true;
		else
			return false;
		
	}

}
