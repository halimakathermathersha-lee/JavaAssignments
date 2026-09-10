import java.io.*;
import java.util.*;
class Avg2{
public static void main(String []args){
Scanner h=new Scanner(System.in);
System.out.println("Enter ur first mark:");
int f=h.nextInt();
System.out.println("Enter ur second mark: ");
int s=h.nextInt();
System.out.println("Enter ur third mark: ");
int t=h.nextInt();
float m=f+s+t;
System.out.println("Finally  ur avg is ="+m/3);
}
}