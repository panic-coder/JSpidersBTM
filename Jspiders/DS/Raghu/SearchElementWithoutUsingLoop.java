public class SearchElementWithoutUsingLoop 
{
	int i=0;
	static int search(int[] arr,int i,int k)
	{
		if(i<arr.length&&arr[i]==k)
		{
			return i;
		}
		return search(arr,i+1,k);
	}
	public static void main(String[] args) 
	{
		int[] arr={3,4,17,2,5};
		int k=17;
		System.out.println(search(arr,0,k));

	}

}
