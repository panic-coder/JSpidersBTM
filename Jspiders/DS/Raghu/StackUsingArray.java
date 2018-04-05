public class StackUsingArray 
{
	Object[] stk;
	int capacity,top=-1;
	public StackUsingArray(int cap) 
	{
		this.capacity=cap;
		stk=new Object[capacity];
	}
	public boolean push(Object obj)
	{
		if(top==capacity-1)
		{
			System.out.println("STACK OVERFLOW");
			return false;
		}
		stk[++top]=obj;
		return true;
	}
	public Object pop()
	{
		if(top==-1)
		{
			System.out.println("STACK UNDERFLOW");
			return null;
		}
		return stk[top--];
	}
	public int size()
	{
		return top+1;
	}
	public Object peek()
	{
		if(top==-1)
		{
			System.out.println("STACK UNDERFLOW");
			return null;
		}
		return stk[top];
	}
	public String toString()
	{
		String s="[";
		for(int i=0;i<=top;i++)
		{
			s=s+stk[i]+" ";
		}
		return s+"]";
	}
	public static void main(String[] args) {
		StackUsingArray ms=new StackUsingArray(5);
		ms.push("JSP");
		ms.push("QSP");
		System.out.println(ms.pop());
		System.out.println(ms.size());
		System.out.println(ms);
	}

}
