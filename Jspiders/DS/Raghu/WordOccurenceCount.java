import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class WordOccurenceCount
{
	static HashMap h=new HashMap();
	static void insert(String[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			h.put(str[i],1);
		}
	}
	public static void main(String[] args) {
		String[] arr={"Bishal","Termi","Bishal","Termi"};
		insert(arr);
		Set s=h.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry m=(Map.Entry
		}
	}
}