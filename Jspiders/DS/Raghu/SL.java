public class SL
{
	class Node
	{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data=data;
		}
	}
	static Node head;
	public boolean add(Object ob)
	{
		Node n=new Node(ob);
		if(head==null)
		{
			head=n;
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.next=n;
		return true;
	}
	public boolean addFirst(Object ob)
	{
		Node n=new Node(ob);
		Node t=head;
		t=t.next;
		head=n;
		return true;
	}
	public boolean addAny(Object ob,int pos)
	{
		Node n=new Node(ob);
		if(pos==0)
		{
			n.next=head.next;
			head=n;
			return true;
		}
		Node t=head;
		for(int i=0;i<pos-1;i++)
		{
			t=t.next;
		}
		n.next=t.next;
		t.next=n;
		return true;
	}
	public boolean delete()
	{
		Node t=head;
		t=t.next;
		head=t;
		return true;
	}
	public boolean deleteAny(Object ob)
	{
		Node n=new Node(ob);
		Node t=head;
		Node prev=null;
		while(t.data!=n && t.next!=null)
		{
			prev=t;
			t=t.next;
		}
		prev.next=t.next;
		return true;
	}
	public String toString()
	{
		Node t=head;
		String s="";
		while(t.next!=null)
		{
			s=s+t.data;
			t=t.next;
		}
		return s;
	}
	public static void main(String[] args) {
		SL l=new SL();
		l.add(2);
		l.add(3);
		System.out.println(l);
	}
}