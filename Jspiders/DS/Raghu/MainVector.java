package TEST;
import java.util.Enumeration;
import java.util.Vector;
public class MainVector
{
public static void main(String[] args) 
{
	Vector vc= new Vector(5);
	System.out.println(vc.capacity());
	System.out.println(vc.size());
	vc.addElement("Rajesh");
	vc.add(123);
	vc.addElement(45.67);
	vc.add(new Date());
	vc.add(new MainVector());
	vc.addElement(null);
	System.out.println();
	
	System.out.println(" <--- vector elements-----> ");
	
Enumeration en=vc.elements();

while(en.hasMoreElements())
{
	System.out.println(en.nextElement());
}

}
}
