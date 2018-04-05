package TEST;
import java.util.Iterator;
import java.util.TreeSet;
public class MainCustomer
{
public static void main(String[] args)
{
	System.out.println("<---Based on ID--->");
	TreeSet ts= new TreeSet(new CompareId());
	ts.add(new Customer(123,"Arun",23));
	ts.add(new Customer(124,"Jaynth",22));
	ts.add(new Customer(121,"Rakesh",28));
	ts.add(new Customer(125, "Lohith",29));

	Iterator it=ts.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("<--Based on Name-->");
	
	TreeSet ts1= new TreeSet( new CompareName());
	ts1.addAll(ts);
	
	it=ts1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
System.out.println("<--Based on Age-->");
	
	TreeSet ts2= new TreeSet( new CompareAge());
	ts2.addAll(ts);
	
	it=ts2.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	
}
}
