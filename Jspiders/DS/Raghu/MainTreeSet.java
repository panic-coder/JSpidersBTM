package TEST;

import java.util.Iterator;
import java.util.TreeSet;

public class MainTreeSet
{
public static void main(String[] args)
{
	TreeSet ts= new TreeSet();
	
	ts.add(123);
	ts.add(12);
	ts.add(24);
	ts.add(12);
	ts.add(156);
	ts.add(8);
	//ts.add(null); nullPointer 
	//ts.add(34.56); classCastException
	//ts.add("A"); classCastException
	System.out.println(ts);
	System.out.println("-----------------");
	
	Iterator it= ts.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}


}
