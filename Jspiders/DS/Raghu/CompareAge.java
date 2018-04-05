package TEST;

import java.util.Comparator;

public class CompareAge implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		if(o1 instanceof Customer && o2 instanceof Customer)
		{
			Customer c1=(Customer)o1;
			Customer c2=(Customer)o2;
			
			if(c1.cAge>c2.cAge)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		
		}
		return 0;
	}

}