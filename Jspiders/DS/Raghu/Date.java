package TEST;

import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the date");
		int d1=noOfdays();
		System.out.println("enter the date");
		int d2=noOfdays();
		int d=d2-d1;
		System.out.println("differnce is "+ d);
		}
		

static int noOfdays()
{
	Scanner s= new Scanner(System.in);

	int day=s.nextInt();
	int mm=s.nextInt();
	int yr=s.nextInt();
	int[] month={0,31,28,31,30,31,30,31,31,30,31,30,31};
	int totalDays=day;
	totalDays+=(yr*365)+(yr/4-yr/100+yr/400);
	for (int i = 0; i < mm; i++) {
		totalDays+=month[i];
		if(mm>2 && (yr%4==0 && yr%100!=0 && yr%400==0))
			totalDays++;}
	return totalDays;


}
}
