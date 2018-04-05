package TEST;

public class MainRunner1 
{
	public static void main(String[] args)
	{
		PrivateVehicle pv = new PrivateVehicle("TS08CA1111");
		CommercialVehicle cv = new CommercialVehicle("TS09AB1111");
		TollData td = new TollData();
		td.makeEntry(pv,"Private","National");
		td.makeEntry(cv,"Commercial","Local");
		System.out.println("Total Commercial Countis:"+td.getTotalCommercialCount()
		+"\nTotal Commercial VehicleTax:"+td.getTotalCommercialTax());
		System.out.println("\nTotal Private Count:"+td.getTotalPrivateCount()
		+"\nTotal Private Vehicle Tax:"+td.getTotalPrivateTax());
		}
}
