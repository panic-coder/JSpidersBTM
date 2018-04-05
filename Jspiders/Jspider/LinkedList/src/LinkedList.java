
public class Node {
	Node next;
	int data;
	public Node(int data){
		this.data=data;
	}
}

public class LinkedList {
	Node head;
	public void append(int data){
		if(head==null){
			head=new Node(data);
			return;
		}
		Node current = head;
		while(current.next!=null){
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void  prepend(int data){
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void delete(int data){
		if(head == null)
			return;
		
		if(head.data == data){
			head = head.next;
			return;
		}
		
		Node current = head;
		while(current.next!=null){
			if(current.next.data==data){
				current.next = current.next.next;
				return;
			}
			
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		Node n = new Node(1);
		LinkedList l = new LinkedList();
		l.append(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		l.delete(3);
		l.prepend(6);
		System.out.println(l);
	}
	
}
