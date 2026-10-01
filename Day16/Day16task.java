import java.io.*;
import java.util.*;
class Day16task{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter number to divide");
int a=s.nextInt();
int b=s.nextInt();
try{
int c=a/b;
System.out.println("Division of "+c);
int []n={45,78,456,67};
System.out.println(n[7]);
}
catch(ArithmeticException e){
  System.out.println(e.getMessage());
}
catch(Exception e){
 System.out.println(e.getMessage());
}
finally{
System.out.println("free the resource");
}
System.out.println("Tku");
}
}