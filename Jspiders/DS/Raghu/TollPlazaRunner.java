public class TollPlazaRunner {
	public static void main(String[] args) {
		PrivateVehicle pv = new PrivateVehicle("TS08CA1111");
		CommercialVehicle cv = new CommercialVehicle("TS09AB1111");
		TollData td = new TollData();
		td.makeEntry(pv,"Private","National");
		td.makeEntry(cv,"Commercial","Local");
		System.out.println("Total Private Count is:"+td.getTotalPrivateCount());
		System.out.println("Total Commercial Count is:"+td.getTotalCommercialCount()+
				"Total Commercial Vehicle Tax:"+td.getTotalCommercialTax());
		System.out.println("Total Private Count:"+td.getTotalPrivateCount()+
				"Total Private Vehicle Tax:"+td.getTotalPrivateTax());
		}

}
