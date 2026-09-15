import java.io.*;
import java.util.*;
class Day6task{
public static void main(String []args){
System.out.println("Enter Ur value: ");
Scanner t=new Scanner(System.in);
int no=t.nextInt();
int s=0,r;
int temp=no;
while(no>0){
r=no%10;
s=s+(r*r*r);
no=no/10;
}
System.out.println("Result is "+s);
if(s==temp){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}