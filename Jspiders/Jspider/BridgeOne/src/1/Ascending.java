
public class Ascending {
	AscendingValues a[];
	int size;
	int top;
	
	/*public Ascending() {
		top=-1;
		this.size=50;
		a= new AscendingValues[this.size];
	}*/
	
	public Ascending(int i) {
		top=-1;
		this.size=i;
		a=new AscendingValues[this.size];
	}


	public void push(AscendingValues item) {
		if(isFull()) {
			top++;
			a[top]=item;
		}
	}
	
	public boolean isFull() {
		if(top==size)
			return false;
		else
			return true;
	}
	
	public void display() {
		AscendingValues t = a[top--];
		System.out.println(t);
		
	}
	
}
