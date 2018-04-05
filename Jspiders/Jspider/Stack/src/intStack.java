
public class intStack {
	private int stack[];
	private int top;
	private int size;
	
	public intStack(){
		top = -1;
		size = 50;
		stack = new int[50];
	}
	
	public intStack(int size){
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}
	
	public boolean isFull(){
		return (top==stack.length-1);
	}
	
	public boolean push(int item){
		if(!isFull()){
			top++;
			stack[top] = item;
			return true;
		}
		else
			return false;
	}
	
	public int pop(){
		return stack[top--];
	}
	
	public void sort(){
		int stack2[] = new int[size];
		while()
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
}
