package practice;

public class LinkedList {
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
		}
	}
	
	Node head;
	private Node temp;
	
	public void addFirst(int data){
		Node n = new Node(data);
		if(head==null){
			head=n;
		}
		/*else{
		n.next=head;
		head=n;
		}*/
	}
	
	public void addPos(int pos,int data){
		if(pos==0){
			addFirst(data);
		}
		else{
		Node t=head;int i=0;
		while(t.next!=null && i<=pos-1){
			t=t.next;
		}
		Node n = new Node(data);
		n.next=t.next;
		t.next=n;
		}
	}
	
	public void add(int data){
		//Node temp = head;
		Node n = new Node(data);
		n.next=head;
		head=n;
	}
	
	public void delete(int pos){
		Node temp=head;
		if(pos==0){
			deleteFirst(pos);
		}
		
		for(int i=0;temp!=null && i<pos-1; i++){
			temp = temp.next;
		}
		//if(temp==null || temp.next==null)
			//return;
		Node next = temp.next.next;
		temp.next=next;
		
	}
	
	private void deleteFirst(int pos) {
		//Node n = new Node(pos);
		//Node temp = head;
		if(pos==0){
			head = head.next; 
		}
		
		
	}
	
	public void printList(){
		Node tnode=head;
		while(tnode!=null){
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	
	public void printListPalindrome(){
		Node tnode=head;
		while(tnode!=null){
			//System.out.println(tnode.data);
			//System.out.println("For palindrome");
			int t = tnode.data,sum=0,r;
			while(t>0){
				r=t%10;
				sum=sum*10+r;
				t=t/10;
			}
			if(sum==tnode.data){
				System.out.println(tnode.data+" is Palindrome");
			}
			else
				System.out.println(tnode.data+" is not Palindrome");
			tnode=tnode.next;
		}
	}
}
