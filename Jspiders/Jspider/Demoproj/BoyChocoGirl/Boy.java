
public class Boy {
	void buyAndGive(){
		Shop1 s = new Shop1();
		MoneyBro m = new MoneyBro();
		m.value = 50;
		Chocolate ac = s.sell(m);
		Girl g = new Girl();
		g.take(ac);
	}
}
