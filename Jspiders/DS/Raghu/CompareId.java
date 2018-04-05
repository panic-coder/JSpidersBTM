package TEST;

import java.util.Comparator;

public class CompareId implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		if(o1 instanceof Customer && o2 instanceof Customer)
		{
			Customer c1=(Customer)o1;
			Customer c2=(Customer)o2;
			return c1.cId-c2.cId;
		}
		return 0;
	}

}
