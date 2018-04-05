public abstract class Vehicle 
{
	String regNo=null;
	public Vehicle(String regNo) {
		this.regNo = regNo;
	}
	abstract float calcTax(String type,String highway);

}
