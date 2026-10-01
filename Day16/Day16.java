import java.io.*;
import java.util.*;
class Day16{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter number to divide");
int a=s.nextInt();
int b=s.nextInt();
try{
int c=a/b;
System.out.println("Division of "+c);
}
catch(ArithmeticException e){
  System.out.println(e.getMessage());
}
System.out.println("Tku");
}
}