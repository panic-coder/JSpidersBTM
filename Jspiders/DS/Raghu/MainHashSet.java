package TEST;
import java.util.HashSet;
import java.util.Iterator;
public class MainHashSet 
{
public static void main(String[] args) 
{
	HashSet hs= new HashSet();
	hs.add("A");
	System.out.println(hs.add("A"));
	hs.add("B");
	hs.add('A');
	hs.add(null);
	hs.add(123);
	System.out.println(hs.add(null));
	hs.add(23.45);
	System.out.println(hs.add(23.45f));
	System.out.println(hs);
	Iterator it= hs.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("----------------------");
	it= hs.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}
