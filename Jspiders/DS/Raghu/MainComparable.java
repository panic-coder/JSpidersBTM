package TEST;

public class MainComparable 
{
public static void main(String[] args)
{
	String st="AB";
	System.out.println(st.compareTo("AC"));
	System.out.println("AB".compareTo("ABC"));
	System.out.println("ABCD".compareTo("ABC"));
	System.out.println("Z".compareTo("A"));
	System.out.println("----------------");
	System.out.println(((Integer)123).compareTo(125));
	System.out.println(((Integer)123).compareTo(123));
	System.out.println(((Integer)123).compareTo(120));
	System.out.println("----------------");
	System.out.println(((Double)34.56).compareTo(45.678));
	System.out.println(((Double)34.56).compareTo(15.678));
	System.out.println(((Double)34.56).compareTo(34.56));

	
}
}
