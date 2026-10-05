import java.io.*;
import java.util.*;
class Day18task{

public static void main(String []a){
Scanner s=new Scanner(System.in);
String []names=new String[5];
for(int i=0;i<5;i++){
System.out.println("Enter Ur name");
names[i]=s.next();
}
for(int i=0;i<names.length;i++){
System.out.println(names[i]);
}
}
}