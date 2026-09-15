import java.io.*;
import java.util.*;
class Day6task2{
public static void main(String []args){
System.out.println("Enter Ur value: ");
Scanner t=new Scanner(System.in);
int no=t.nextInt();
int s=0,r;

while(no>0){
r=no%10;
s=s+r;
if(no>9){
s=s*10;
}
no=no/10;
}
System.out.println("Result is "+s);

}
}