
public class LinkedList {
	//Node next;
	
	class Node{
		int data;
		Node next;
		public Node(int d) {
			data=d;
			//next=null;
		}
	}
	
	Node head=null;
	
	public void insert(int data) {
		Node t=head;
		Node n = new Node(data);
	if(head==null) {
		n.next=head;
		head=n;
		
	}	
		
		else if(t.data>n.data) {
			//while(t.next!=head) {
				//t=t.next;
				//t.next=n;
				n.next=head;
				head=n;
			//}
		}
		
		else  {
			//while(t.next!=head && t.next.data<n.data) {
			
				//t=t.next;
				n.next=t.next;
				t.next=n;
			//}
		}
		
	}
	
	public void display() {
		Node t=head;
		while(t!=null) {
			
			System.out.println(t.data);
			t=t.next;
		}
	}
}
