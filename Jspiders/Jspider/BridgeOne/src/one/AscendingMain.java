package one;



public class AscendingMain{
	public static void main(String[] args) {
		AscendingValues c1 = new AscendingValues("Apple");
		AscendingValues c2 = new AscendingValues("Ball");
		
		Ascending a = new Ascending(2);
		a.push(c1);
		a.push(c2);
		
		a.display();
		a.display();
		
	}
}
