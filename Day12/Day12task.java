import java.io.*;
class sample{
private int a,b,c;
public sample(){
a=100;
b=50;
}
public sample(int x,int y){
a=x;
b=y;
}
public void addition(){
c=a*b;
System.out.println("result is " +c);
}
}
class Day12task{
public static void main(String []args){
sample s=new sample();
sample s1=new sample(20,50);
s.addition();
s1.addition();
}
}