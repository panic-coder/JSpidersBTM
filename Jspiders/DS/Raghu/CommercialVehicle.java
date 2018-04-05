public class CommercialVehicle extends Vehicle
{

	public CommercialVehicle(String regno)
	{
		super(regno);
	}

	@Override
	float calcTax(String type, String highway)
	{if(highway.equalsIgnoreCase("National"))
		return 150;
	else
	if(highway.equalsIgnoreCase("Local"))
		return 50;
	else
	if(highway.equalsIgnoreCase("State"))
		return 100;
	else
	  throw new RoadException();
	}

}
