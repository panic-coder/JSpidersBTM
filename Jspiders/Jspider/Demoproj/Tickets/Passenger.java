
public class Passenger {
	void takeTicket(){
		MoneyBro m = new MoneyBro(); m.value = 20;
		Conductor c = new Conductor();
		Ticket t = c.issueTicket(m);
		System.out.println("Passeneger got ticket "+t);
	}
	public static void main(String[] args) {
		Passenger p = new Passenger();
		p.takeTicket();
	}

}
