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
public void findpercent(){
float percent=a*b/100;//amt*r 100
System.out.println("Percentage is " +percent);
}
}
class Day12task1{
public static void main(String []args){
sample s=new sample();
sample s1=new sample(20,50);
s.findpercent();
s1.findpercent();
}
}