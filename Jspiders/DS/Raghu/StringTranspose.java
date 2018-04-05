public class StringTranspose 
{
	static void stringTrans(String[] str)
	{
		int max=0;
		for(int i=0;i<str.length;i++)
		{
			if(max<str[i].length())
			{
				max=str[i].length();
			}
		}
		for(int i=0;i<max;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(str[j].length()==i)
				{
					break;
				}
				System.out.print(str[j].charAt(i)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		String[] arr={"Hello","Geeks","for","Geeks"};
		stringTrans(arr);
	}

}
