
public class StackMain {
	public static void main(String[] args) {
		StackSearch s = new StackSearch(5);
		s.push(1);
		s.push(2);
		s.push(5);
		s.push(4);
		s.push(5);
		
		s.pop();
		
		s.search(4);
		s.search(10);
		
		s.sort();
		
		s.display();
		
		
	}
}
