import java.io.*;
import java.util.*;
class HobbiesCollect{
public static void main(String []args){
Scanner T=new Scanner(System.in);
System.out.println("Enter Your favourite Book: ");
String book=T.nextLine();
System.out.println("Enter the Author Name:");
String A=T.nextLine();
System.out.println("Enter the Year of Publish");
int year=T.nextInt();
System.out.println("Favourite Book ="+book);
System.out.println("Author Name="+A);
System.out.println("Year of publish="+year);
} 
}