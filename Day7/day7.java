import java.io.*;
import java.util.*;
class day7{
public static void main (String []args){
String choice="";
Scanner s= new Scanner(System.in);
while(!choice.equals("stop")){
System.out.println("Have you got any idea????");
String msg=s.next();
if(msg.equals("yes")){
System.out.println("Enter ur idea");
String idea=s.next();
System.out.println("ur idea is crt:"+idea);
choice="stop";
}
else{
choice="continue";
}
}
}
}