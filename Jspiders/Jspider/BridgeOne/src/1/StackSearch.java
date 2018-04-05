
public class StackSearch {
	int a[];
	int size;
	int top;
	
	/*public StackSearch() {
		top=-1;
		this.size=50;
		a= new int[this.size];
	}*/
	
	public StackSearch(int i) {
		top=-1;
		this.size=i;
		a=new int[this.size];
	}
	

	public void push(int item) {
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
	
	public void pop() {
		while(top>=0) {
			System.out.println(a[top]);
			top--;
		}
	}
	
	public void search(int searchItem) {
		top++;int c=0;
		while(top<size) {
			if(a[top]==searchItem) {
				c++;
			}
			top++;
			//System.out.println(top);
		}
		if(c>0)
			System.out.println(searchItem+" is present");
		else
			System.out.println(searchItem+" is not present");
		//System.out.println(top);
		top=-1;
	}
	
	public void sort() {
	for(int i=0;i<size;i++) {
		for(int j=i+1;j<size;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
	}
}
