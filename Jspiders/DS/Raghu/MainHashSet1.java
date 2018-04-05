package TEST;
import java.util.LinkedHashSet;

public class MainHashSet1 
{
public static void main(String[] args) 
{
	LinkedHashSet h= new  LinkedHashSet(5);
	h.add(new Student(123,"Suresh",63.79));
	h.add(new Student(122,"Ramesh",87.83));
	h.add(new Student(125,"Ramesh",63.79));
	h.add(new Student(124,"Manjesh",57.83));
	h.add(new Student(126,"Suresh",67.89));
	
	for(Object obj:h)
	{
		System.out.println(obj);
	}
}
}
