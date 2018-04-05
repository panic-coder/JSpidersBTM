
public class Date {
	int dd;
	int mm;
	int yy;
	int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	Date(int dd, int mm ,int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	int numberOfDays(){
		int days=dd;
		int y=yy-1;
		days=y*365+(y/4-y/100+y/400);
		
		for(int i=1;i<mm;i++){
			days=days+month[i];
		}
		
		if(mm>2 && (yy%4==0 && yy%100!=0 || yy%400==0))
			days=days+1;
		
		return days;
		
	}
}
