import java.util.ArrayList;
import java.util.List;
public class TollData 
{
	public class Entry
	{
		Vehicle v;
		float f;
		public Entry(Vehicle v,float f)
		{
		this.v = v;
		this.f = f;
		}
	}
	List<Entry> vehicles= new ArrayList<Entry>();

	public void makeEntry(Vehicle v, String type, String highway) 
	{
		
		vehicles.add(new Entry(v, v.calcTax(type, highway)));
	}

	

	public int getTotalPrivateCount() 
	{
		int count=0;
		for (Entry entry : vehicles) 
		{
			if(entry.v instanceof PrivateVehicle)
				count++;
		}
		
	return count;
	}

	public int getTotalCommercialCount()
	{
		int count=0;
		for (Entry entry : vehicles) 
		{
			if(entry.v instanceof CommercialVehicle)
				count++;
		}
		return count;
	}

	public float getTotalCommercialTax() 
	{
	float tax=0.0f;
		for (Entry entry : vehicles) 
		{
			if(entry.v instanceof CommercialVehicle)
			{
				tax=tax+entry.tax;
			}
				
		}
		return tax;
	}

	public float getTotalPrivateTax() {
		float tax=0.0f;
		for (Entry entry : vehicles) 
		{
			if(entry.v instanceof PrivateVehicle)
			{
				tax=tax+entry.tax;
			}
				
		}
		return tax;
	}

}
