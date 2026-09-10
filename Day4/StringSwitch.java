import java.io.*;
import java.util.*;
class StringSwitch{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter your payment method");
String p=s.nextLine();
switch(p){
case "Upi":
System.out.println("Upi Payment succesfully");
break;
case "Netbanking":
System.out.println("Net banking Payment succesfully");
break;
case "Debit":
System.out.println("Debit Payment succesfully");
break;
default:
System.out.println("please enter ur payment method");
break;
}
}
}