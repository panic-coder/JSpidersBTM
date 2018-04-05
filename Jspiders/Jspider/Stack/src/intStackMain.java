
public class intStackMain {
	public static void main(String[] args) {
		intStack stack = new intStack();
		if(!stack.isFull()){
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
		}
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
