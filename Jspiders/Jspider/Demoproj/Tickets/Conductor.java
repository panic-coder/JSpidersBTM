
public class Conductor {
	Ticket issueTicket(MoneyBro m){
		Ticket t = new Ticket();
		t.amount = m.value;
		t.date = "17 Nov 2017";
		System.out.println("Conductor issues Tickets");
		return t;
	}

}
