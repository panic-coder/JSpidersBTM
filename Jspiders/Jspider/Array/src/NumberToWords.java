
public class NumberToWords {
	
	void nTow(int n,String st){
		String one[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
		
		String two[]={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
		
		if(n>19){
			System.out.print(two[n/10]+" "+one[n%10]+" ");
		}
		
		else
		{
			System.out.print(one[n]+" ");
		}
		
		if(n!=0)
		{
			System.out.print(st+" ");
		}
		
	}
}
