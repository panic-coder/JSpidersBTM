
public class PersonQQ {
	PersonQ q[];
	int size;
	int total;
	int front;
	 int rear;
	
	public PersonQQ(){
		size = 100;
		total = 0;
		front = 0;
		rear = 0;
		q = new PersonQ[size];
	}
	
	public PersonQQ(int size){
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		q = new PersonQ[this.size];
	}
	
	public boolean enqueue(PersonQ item){
		if(isFull()){
			return false;
		} else {
			total++;
			q[rear]=item;
			rear = (rear+1)%size;
			return true;
		}
	}
	
	public PersonQ dequeue(){
		PersonQ item  = q[front];
		total--;
		front = (front+1)%size;
		return item;
	}
	
	public boolean isFull(){
		return (total == size);
	}
	
	public void display(){
		int f=front;
		if(total!=size){
			for(int i=0;i<total;i++){
				System.out.println(" "+q[f].toString());
				f=(f+1)%size;
			}
		}
	}
}
