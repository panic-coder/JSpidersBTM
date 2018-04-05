import java.util.Scanner;
import java.util.Stack;
public class EvaluatePostfixExpression {
	static Scanner sc=new Scanner(System.in);
	static double evaluate(String s)
	{
		Stack<Double> st=new Stack<Double>();
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90 || ch[i]>=97&&ch[i]<=122)
			{
				System.out.println("Enter the value for "+ch[i]);
				double d=sc.nextDouble();
				st.push(d);
			}
			else
			{
				switch(ch[i])
				{
				case '+':st.push(st.pop()+st.pop());
				break;
				case '-':double a=st.pop();
				double b=st.pop();
					st.push(b-a);
				break;
				case '*':st.push(st.pop()*st.pop());
				break;
				case '/':st.push(st.pop()/st.pop());
				break;
				default:System.out.println("Invalid Expression");
				}
			}
		}
		double d=st.pop();
		return d;
	}

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		System.out.println(evaluate(s));
	}

}
