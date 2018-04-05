package practice;

import java.util.Scanner;

public class Harmonic
{
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
int n,i;
float sum=0;
int a[]={1110,1010,1111};
int count1=0,count2=0;
for(int j=0;j<a.length;j++){
	String st = String.valueOf(a[j]);
	char c1[]=st.toCharArray();
	count1=0;
	for(int k=0;k<c1.length;k++){
		
		if(c1[k]=='1'){
			count1++;
		}
	}
	//System.out.println(count);
	
	for(int l=1+1;l<a.length-1;l++){
		String st2 = String.valueOf(a[j]);
		char c2[]=st2.toCharArray();
		count2=0;
		for(int k=0;k<c2.length;k++){
			
			if(c2[k]=='1'){
				count2++;
			}
		}
	}
}
System.out.println("------------------");
n=s.nextInt();

for(i=1;i<=n;i++)
{
sum=sum+(float)1/i;
}

System.out.println("Sum="+sum);
s.close();
}
}