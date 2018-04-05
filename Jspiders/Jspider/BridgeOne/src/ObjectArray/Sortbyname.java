package ObjectArray;

import java.util.Comparator;


public class Sortbyname implements Comparator<Student>
{
 // Used for sorting in ascending order of
 // roll name
 public int compare(Student a, Student b)
 {
     return compareTo(a.name,b.name);
 }
 
 public static int compareTo(String str1,String str2)
	{
		int l=0;
		if(str1.length()>str2.length())
			l=str2.length();
		else
			l=str1.length();
		for (int i = 0; i < l; i++) {
			
			while(i<l&&str1.charAt(i)-str2.charAt(i)==0)
			{
				
				i++;
			}
			if(str1.length()==str2.length()&&str2.length()==i)
				return 0;
			if(str1.length()==i||str2.length()==i)
			{
				if(str1.length()==i)
					return -1;
				else return 1;
			}
			return str1.charAt(i)-str2.charAt(i);
		}
		return 0;
	}
 
}