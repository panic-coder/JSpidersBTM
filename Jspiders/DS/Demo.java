import java.util.*;
class Demo {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int sum=1,count=0;
        while(n!=0){
            sum=sum*n;
            n--;
        }
		System.out.println(sum);
        String st = Integer.toString(sum);
        char c[]=st.toCharArray();
		int t=c.length;
		System.out.println(t);
        for(int i=c.length;i>=0;i--){
            if(c[i]=='0'){
                count++;
            }
            else
                break;
        }
        System.out.println(count);
        
    }
}
