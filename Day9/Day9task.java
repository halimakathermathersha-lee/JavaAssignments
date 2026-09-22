import java.io.*;
import java.util.*;
class Student{
public int Additional(){
int a=156;
int b=678;
return a+b;
}														
}

class Day9task{
public static void main(String []args){
Student s1=new Student();
int result=s1.Additional();
System.out.print("Result"+" "+result);
}
}