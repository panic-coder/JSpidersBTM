import java.util.Random;

public class Person {
 Eatable buyAndGive(){
	 Random r = new Random();
	 int rn = r.nextInt(3);
	 Eatable e = null;
	 if(rn==0){
		 e=new Paneer();
		 ((Paneer) e).prepareManchurian();
	 }
	 
	 if(rn==1){
		 e=new Chilly();
		 ((Chilly) e).prepareBhajji();
	 }
	 
	 if(rn==2){
		 e=new Carrot();
		 ((Carrot) e).prepareHalwa();
	 }
	 
	return e;
	 
 }
}
