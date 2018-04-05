import java.util.Scanner;
public class OctalToBin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		String hx = sc.next();
		int dec = octalToBin(hx);
		System.out.println(n);
	}
	
	String binToHex(int bin)
	{
		int dec = binToDec(bin);
		String hx=decToHex(bin);
		return hx;
	}
	
	String hexToBin(String st)
	{
		int dec = hexToBin(st);
		String hx = decToHex(dec);
		return hx;
	}
	
	String octalToBin(int oct)
	{
		int dec = octalToDec(oct);
		