package TEST;
import java.util.TreeSet;
public class MainString
{
public static void main(String[] args)
{
	TreeSet ts=new TreeSet(new Descending());
	ts.add("B");
	ts.add("C");
	ts.add("A");
	ts.add("C");
	
	for(Object ob:ts)
	{
		System.out.println(ob);
	}
}
}
