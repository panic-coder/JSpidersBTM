import java.util.Scanner;
public class TrafficLight
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String color;
		System.out.println("Enter the traffic light color");
		color = s.next();
		if(color.equalsIgnoreCase("red"))
			System.out.println("Please Stop");
		if(color.equalsIgnoreCase("green"))
			System.out.println("Please Go");
		if(color.equalsIgnoreCase("yellow"))
			System.out.println("Please Wait");
	}
}