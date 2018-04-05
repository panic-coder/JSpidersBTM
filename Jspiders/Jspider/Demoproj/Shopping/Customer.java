
public class Customer {
	String customerName = "Guldu";
	void purchase(){
		Shop1 s = new Shop1();
		Product p = s.sell();
		System.out.println("Customer purchase ");
		System.out.println("Product details : ");
		System.out.println(p.type + "  " + p.price);
	}

}
