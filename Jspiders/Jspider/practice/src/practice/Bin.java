package practice;
import java.util.Scanner;
public class Bin {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        System.out.println("Enter the number");
	        int n = s.nextInt();
	        s.close();
	        int sum=0;String ss="";
	        int ar[]=new int[50];
	        int i=0;
	        while(n>0){
	            int r = n%2;
	            i++;
	            ar[i]=r;
	        }
	        
	        for(int k=0;k<=ar.length;k++){
	        	System.out.println(ar[i]);
	        }
	       
	        
	        String st = String.valueOf(ss);
	        int count = 0,l = 0;
	        for(int j=0;j<st.length();j++){
	        	char c = st.charAt(i);
	        	if(c=='0')
	        		count++;
	        	else if(c=='1')
	        		l=count;
	        		
	        }
	        System.out.println(l);
	}
}
