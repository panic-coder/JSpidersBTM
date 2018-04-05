import java.util.Scanner;
public class Zodiac
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String sign;
		System.out.println("Enter your zodiac sign : aries, taurus, gemini, cancer, leo, virgo, libra, scorpio, sagittarius, capricorn, aquarius & pisces");
		sign = s.next();
		if(sign.equalsIgnoreCase("aries"))
			System.out.println("Birthday between March 21 - April 20");
		if(sign.equalsIgnoreCase("taurus"))
			System.out.println("Birthday between April 21 - May 20");
		if(sign.equalsIgnoreCase("gemini"))
			System.out.println("Birthday between May 21 - June 20");
		if(sign.equalsIgnoreCase("cancer"))
			System.out.println("Birthday between June 21 - July 20");
		if(sign.equalsIgnoreCase("leo"))
			System.out.println("Birthday between July 21 - August 20");
		if(sign.equalsIgnoreCase("virgo"))
			System.out.println("Birthday between August 21 - September 20");
		if(sign.equalsIgnoreCase("libra"))
			System.out.println("Birthday between September 21 - October 20");
		if(sign.equalsIgnoreCase("scorpio"))
			System.out.println("Birthday between October 21 - November 20");
		if(sign.equalsIgnoreCase("sagittarius"))
			System.out.println("Birthday between November 21 - December 20");
		if(sign.equalsIgnoreCase("capricorn"))
			System.out.println("Birthday between December 21 - January 20");
		if(sign.equalsIgnoreCase("aquarius"))
			System.out.println("Birthday between January 21 - February 20");
		if(sign.equalsIgnoreCase("pisces"))
			System.out.println("Birthday between February 21 - March 20");
	}
}