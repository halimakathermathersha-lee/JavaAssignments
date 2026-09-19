import java.io.*;
import java.util.*;
class day7task{
public static void main (String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter ur transaction amt:");
float amt=s.nextFloat();
if(amt >2000){
float tax=amt*2/100;
amt=amt+tax;
}
System.out.println("Your payment made successfully: "+amt);
}
}