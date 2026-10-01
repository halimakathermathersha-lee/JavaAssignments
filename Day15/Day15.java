import java.io.*;
class student{
public static int count;
public student(){
count=0;
}
public void increment(){
count++;
}

public void display(){
System.out.println("count is "+count);
}
}

class Day15{
public static void main(String []args){
student s=new student();
student s1=new student();
s.increment();
s1.increment();
s.display();
}
}