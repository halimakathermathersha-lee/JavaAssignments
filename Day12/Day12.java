import java.io.*;
class sample{
private int a,b,c;

public sample(){
a=100;
b=50;
}

public void addition(){
c=a+b;
System.out.println("result is " +c);

}
}
class Day12{
public static void main(String []args){
sample s=new sample();
s.addition();
}
}