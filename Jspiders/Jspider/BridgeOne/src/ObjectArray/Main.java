package ObjectArray;



import java.util.ArrayList;
import java.util.Collections;

public class Main
{
 public static void main (String[] args)
 {
     ArrayList<Student> ar = new ArrayList<Student>();
     ar.add(new Student("bbbb"));
     ar.add(new Student("aaaa"));
     ar.add(new Student("cccc"));

     System.out.println("Unsorted");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));

   //  Collections.sort(ar, new Sortbyroll());

   /*  System.out.println("\nSorted by rollno");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));*/

     Collections.sort(ar, new Sortbyname());

     System.out.println("\nSorted by name");
     for (int i=0; i<ar.size(); i++)
         System.out.println(ar.get(i));
 }
}