
public class Calc {
	
	void add(int i){
		System.out.println("Primitive "+i);
		
	}
	
	public static void main(String[] args) {
		Calc c = new Calc();
		//c.add(25);
		c.add(new Integer(88));
	}

}
