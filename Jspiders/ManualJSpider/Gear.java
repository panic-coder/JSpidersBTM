import java.util.Scanner;
public class Gear
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int speed;
		System.out.println("Enter the speed");
		speed = s.nextInt();
		if(speed == 0)
			System.out.println("Neutral");
		else if(speed>0 && speed <= 10)
			System.out.println("First Gear");
		else if(speed > 10 && speed <= 30)
			System.out.println("Second Gear");
		else if(speed > 30 && speed <= 50)
			System.out.println("Third Gear");
		else if(speed > 50 && speed <= 80)
			System.out.println("Fourth Gear");
		else if(speed > 80 && speed <= 100)
			System.out.println("Fifth Gear");
	}
}