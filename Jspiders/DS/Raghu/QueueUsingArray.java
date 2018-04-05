public class QueueUsingArray {
	int front=-1,rear=-1,cap;
	Object[] queue;
	public QueueUsingArray(int cap) {
		this.cap=cap;
		queue=new Object[cap];
	}
	public boolean enqueue(Object obj)
	{
		if(rear==cap-1)
		{
			System.out.println("QUEUE OVERFLOW");
			return false;
		}
		if(front==-1)
		{
			front++;
		}
		queue[++rear]=obj;
		return true;
	}
	public Object dequeue()
	{
		if(front==-1 || front>rear)
		{
			System.out.println("QUEUE UNDERFLOW");
			rear=front=-1;
			return null;
		}
		return queue[front++];	
	}
	public int size()
	{
		if(front==-1)
		{
			return 0;
		}
		if(rear==-1)
		{
			return 0;
		}
		return rear-front+1;
	}
	public String toString()
	{
		String st="[";
		for(int i=front;i<=rear;i++)
		{
			st=st+queue[i]+",";
		}
		return st+"]";
	}
	public static void main(String[] args) 
	{
		QueueUsingArray q=new QueueUsingArray(5);
		q.enqueue("JSP");
		q.enqueue("JSP");
		q.dequeue();
		System.out.println(q);
	}

}
