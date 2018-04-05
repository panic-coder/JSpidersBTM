package practice;

import java.util.*;
public class Pattern2{
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
    long n,i,swaps=0,k;
    n=s.nextLong();
    k=s.nextLong();
    long cnt=0;
    long a[] = new long[(int) n];
    for(i=0;i<n;i++)
    {
        a[(int) i]=s.nextLong();
        if(a[(int) i]>=k)
            cnt++;
        
    }
    System.out.println(cnt);
    long min;
    swaps=0;
    for(i=0;i<cnt;i++)
    {
       if(a[(int) i]<k)
            swaps++;
    }
    System.out.println(swaps);
    min=swaps;
    for(i=0;i<n-cnt;i++)
    {
        long start=i;
        long end=start+cnt;
        if(a[(int) end]<k)
            swaps++;
        if(a[ (int) start]<k)
            swaps--;
        if(swaps<min)
            min=swaps;
    }
    
    
   System.out.println(min);
        
    
}
}