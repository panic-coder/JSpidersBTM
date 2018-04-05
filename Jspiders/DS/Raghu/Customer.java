package TEST;

public class Customer
{
int cId;
String cName;
int cAge;
public Customer(int cId, String cName, int cAge) 
{
	super();
	this.cId = cId;
	this.cName = cName;
	this.cAge = cAge;
}
@Override
public String toString() {
	return "Customer [" + cId + "," + cName + "," + cAge + "]";
}

}
