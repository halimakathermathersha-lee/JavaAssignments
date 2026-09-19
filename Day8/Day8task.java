import java.io.*;
import java.util.*;
class Day8task{
public static void main(String []args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit:");
int limit=s.nextInt();
int no=6;
int diff=7;
while(no<limit){
System.out.println(no + ""); //6
//7  12  
no=no+diff;
diff+=5;
}
}
}