
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("Shubham");
		Person p2 = new Person("Monu");
		
		PersonStack ps = new PersonStack();
		ps.push(p1);
		ps.push(p2);
		
		System.out.println(ps.pop());
		System.out.println(ps.pop());
	}
}
