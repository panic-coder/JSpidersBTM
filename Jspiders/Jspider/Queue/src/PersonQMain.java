
public class PersonQMain {
	public static void main(String[] args) {
		PersonQ q1 = new PersonQ("Shubham");
		PersonQ q2 = new PersonQ("Monu");
		
		PersonQQ q = new PersonQQ();
		q.enqueue(q1);
		q.enqueue(q2);
		
		q.display();
		
	}
}
