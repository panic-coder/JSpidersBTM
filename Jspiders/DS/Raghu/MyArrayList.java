import java.util.Collection;
import java.util.Iterator;
public class MyArrayList implements Collection 
{
	Object[] list;
	int cap,size=0;
	MyArrayList()
	{
		cap=10;
		list=new Object[cap];
	}
	MyArrayList(int cap)
	{
		this.cap=cap;
		list=new Object[cap];
	}
	MyArrayList(Collection c)
	{

	}

	@Override
	public boolean add(Object arg0) 
	{
		try
		{
			if(size==cap)
			{
				cap=(cap*(3/2))+1;
				Object[] newlist=new Object[cap];
				for(int i=0;i<list.length;i++)
				{
					newlist[i]=list[i];
				}
				list=newlist;
			}
			list[size]=arg0;
			size++;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean addAll(Collection arg0) 
	{
		try
		{
			Object[] ob=arg0.toArray();
			for(int i=0;i<ob.length;i++)
			{
				this.add(ob[i]);
			}
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public void clear() 
	{
		size=0;
		cap=10;
		list=new Object[cap];
	}

	@Override
	public boolean contains(Object arg0) 
	{
		for(int i=0;i<list.length;i++)
		{
			if(arg0==list[i])
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) 
	{
		try
		{
		Object[] arr=arg0.toArray();
		int n=arr.length;
		for(int i=0;i<list.length;i++)
		{
			if(arr[i]==list[i])
			{
				n--;
			}
		}
		if(n==0)
		{
			return true;
		}
		}
		catch(Exception e)
		{
		return false;
		}
		return false;
	}

	@Override
	public boolean isEmpty() 
	{
		return size==0;
	}

	@Override
	public Iterator iterator() 
	{
		class MyIterator implements Iterator
		{
			int cursor=0;
			@Override
			public boolean hasNext() 
			{
				return cursor<size;
			}

			@Override
			public Object next() 
			{
				return list[cursor++];
			}
		}
		return new MyIterator();
	}

	@Override
	public boolean remove(Object arg0) 
	{
		for(int i=0;i<list.length;i++)
		{
			if(list[i]==arg0)
			{
				for(int j=i+1;j<size;j++)
				{
					list[j-1]=list[j];
				}
				size--;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() 
	{
		return size;
	}

	@Override
	public Object[] toArray() 
	{
		Object[] arr=new Object[size];
		for(int i=0;i<list.length;i++)
		{
			arr[i]=list[i];
		}
		return arr;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		MyArrayList l=new MyArrayList(10);
		l.add("Raju");
		l.add(123);
		l.add("Terminator");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
