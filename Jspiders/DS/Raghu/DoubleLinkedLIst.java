import java.util.Iterator;

public class DoubleLinkedLIst 
{
	static DoubleLinkedLIst l=new DoubleLinkedLIst();
	class Node
	{
		Object data;
		Node prev;
		Node next;
		Node(Object data)
		{
			this.data=data;
		}
	}
	Node head=null;
	public boolean add(Object ob)
	{
		Node n=new Node(ob);
		if(head==null)
		{
			head=n;
	        return true;
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.next=n;
		n.prev=t;
		return true;
	}
	public boolean addFirst(Object ob)
	{
		Node n=new Node(ob);
		if(head==null)
		{
			head=n;
			return true;
		}
		n.next=head;
		head.prev=n;
		head=n;
		return true;
	}
	public boolean addAny(Object ob,int pos)
	{
		Node n=new Node(ob);
		if(head==null)
		{
			head=n;
			return true;
		}
		Node t=head;
		int i=0;
		while(i!=pos)
		{
			t=t.next;
			i++;
		}
		t.prev.next=n;
		n.prev=t.prev;
		n.next=t;
		return true;
	}
	public Object deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return null;
		}
		Object ob=head.data;
		head.next.prev=null;
		head=head.next;
		return ob;
	}
	public Object deleteLast()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return null;
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		Object ob=t.data;
		if(t==head)
		{
			head=null;
		}
		else
		{
		t.prev.next=null;
		}
		return ob;
	}
	public Object remove(int index)
	{
		int count=0;
		if(head==null)
		{
			System.out.println("List is empty");
			return null;
		}
		Node t=head;
		while(t.next!=null)
		{
			if(index==count)
			{
				break;
			}
			count++;
			t=t.next;
		}
		Object ob=t.data;
		if(head==t)
		{
			head=head.next;
			head.prev=null;
		}
		else
		{
			t.prev.next=t.next;
			if(t.next!=null)
			t.next.prev=t.prev;
		}
		return ob;
	}
	public String toString()
	{
		String s="";
		Node t=head;
		while(t!=null)
		{
			s=s+t.data+" ";
			t=t.next;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		l.add(20);
		l.add("JSP");
		l.add("QSP");
		l.addAny(1,2);
		System.out.println(l);
	}
}
