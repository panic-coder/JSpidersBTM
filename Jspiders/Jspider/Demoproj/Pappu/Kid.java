
public class Kid {
	String kidName = "Pappu";
	void takeAndEat(){
		Mom m = new Mom();
		Chocolate c = m.give();
		System.out.println("Chocolate taken");
		System.out.println("Chocolate name : "+ c.chocolateName);
		System.out.println(m.momName+" is the mom \n gives Chocolate to kid \n named "+kidName);
	}

}
