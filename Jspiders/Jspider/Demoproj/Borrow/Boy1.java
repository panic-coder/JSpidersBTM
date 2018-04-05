
public class Boy1 {
	void takeMoneyFromFriend(){
		Friend f = new Friend();
		MoneyBro money = f.giveMoney();
		money.value1 = money.value1/2; 
		Brother b1 = new Brother();
		b1.takeMoney(money);
	}
	public static void main(String[] args) {
		Boy1 b2 = new Boy1();
		b2.takeMoneyFromFriend();
	}
}
