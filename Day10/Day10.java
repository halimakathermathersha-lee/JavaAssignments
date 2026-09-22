import java.io.*;
import java.util.*;
class painting{
private String type;
private String needs;
public void display(){
System.out.println("Enter ur type of art");
Scanner s=new Scanner(System.in);
type=s.nextLine();
System.out.println("Enter ur needs :");
needs=s.next();

System.out.println(type+" " + " Needs"+" "+ needs);
}
}
class Day10{
public static void main(String []args){
painting p=new painting();
p.display();
}
}