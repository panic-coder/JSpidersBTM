import java.util.*;
public class StringBalanace 
{
	static boolean isBalanced(String s)
	{
		Stack<Character> st=new Stack<Character>();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char c=ch[i];
			if(c=='{'||c=='('||c=='[')
			{
				st.push(c);
			}
			else
			{
				if(st.isEmpty())
				{
					return false;
				}
				switch(c)
				{
				case '}':if(st.pop()!='{')
					return false;
				break;
				case ']':if(st.pop()!='[')
					return false;
				break;
				case ')':if(st.pop()!='(')
					return false;
				break;
				default:return false;

				}
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		boolean rs=isBalanced(s);
		if(rs)
		{
			System.out.println("String is balanced");
		}
		else
		{
			System.out.println("String is not balanced");
		}
	}
}
