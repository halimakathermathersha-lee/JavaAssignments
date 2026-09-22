import java.io.*;
import java.util.*;
class Student{
private int roll_no,mark;
private String name;
public void getDetails(){
Scanner s=new Scanner(System.in);
System.out.println("Enter Your Roll no");
roll_no=s.nextInt();
System.out.println("Enter Your Name");
name=s.next();
System.out.println("Enter Your mark");
mark=s.nextInt();
}
public void displayDetails(){
System.out.println("Name:"+name);
System.out.println("RollNo:"+roll_no);
System.out.println("Mark:"+mark);
}
}

class Day9{
public static void main(String []args){
Student s1=new Student();
Student s2=new Student();
s1.getDetails();
s1.displayDetails();
s2.getDetails();
s2.displayDetails();
}
}