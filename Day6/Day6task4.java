import java.io.*;
import java.util.*;
class Day6task4{
public static void main(String []args){
int no=100;
int s=0,r;
int temp=no;
while(no<=999){
  while(no>0){
    r=no%10;
    s=s+(r*r*r);
    no=no/10;
    }
  if(s==temp){ 
    System.out.println("Yes"+s);

    }
  
s=0;
temp++;
no=temp;
}
}
}