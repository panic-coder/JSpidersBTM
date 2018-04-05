

//Java program to demonstrate working of Comparator
//interface
import java.util.*;
import java.lang.*;
import java.io.*;

//A class to represent a student.
public class Student
{
 int rollno;
 String name, address;

 // Constructor
 public Student(int rollno, String name,
                            String address)
 {
     this.rollno = rollno;
     this.name = name;
     this.address = address;
 }

 // Used to print student details in main()
 public String toString()
 {
     return this.rollno + " " + this.name +
                        " " + this.address;
 }
}


