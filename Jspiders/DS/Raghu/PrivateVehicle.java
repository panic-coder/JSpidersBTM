public class PrivateVehicle extends Vehicle
{

	public PrivateVehicle(String regno) 
	{
		super(regno);
	}

	@Override
	float calcTax(String type, String highway) throws RoadException
	{
	if(highway.equalsIgnoreCase("National"))
		return 90;
	else
	if(highway.equalsIgnoreCase("Local"))
		return 30;
	else
	if(highway.equalsIgnoreCase("State"))
		return 60;
	else
	  throw new RoadException();
	  
		
	}

	}


