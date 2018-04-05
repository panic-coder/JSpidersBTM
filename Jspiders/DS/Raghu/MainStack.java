package TEST;
import java.util.Enumeration;
import java.util.Stack;
public class MainStack
{
public static void main(String[] args) 
{
	Stack stk= new Stack();
	System.out.println(stk.push("jsp"));
	stk.push("qsp");
	System.out.println(stk.push(123));
	stk.push(new Date());
	System.out.println("-------------------");
	System.out.println(stk);
	System.out.println("-------------------");
	Enumeration en= stk.elements();
	while(en.hasMoreElements())
	{
		System.out.println(en.nextElement());
	}
	System.out.println("-----------------");
	System.out.println(stk.pop());
	System.out.println(stk.peek());
	stk.push(45.67);
	System.out.println(stk.peek());
	System.out.println(stk.peek());
	System.out.println("-----------------");
	System.out.println(stk.search("jsp"));
	System.out.println(stk.search(123));
	stk.push("Rajesh");
	System.out.println(stk.search("jsp"));
	System.out.println(stk.search(123));
	System.out.println("--------------");
	System.out.println(stk.search(stk.peek()));
	System.out.println(stk.indexOf(stk.peek()));
	
}
}
