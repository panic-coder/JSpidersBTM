package TEST;

import java.util.Iterator;
import java.util.TreeSet;

public class TestRunner 
{

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add(new Student1("Ramesh",123,24,67.7));
		t.add(new Student1("Kamlesh",124,25,63.7));
		t.add(new Employee("Lokesh", 123, 20000, 27));
		t.add(new Employee("Manjesh", 125, 20000, 27));
		Iterator it=t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
