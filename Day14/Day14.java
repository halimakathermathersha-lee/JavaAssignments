import java.io.*;
class sample{
public float c=0;
public void Addition(int a ,int b){
   c=a+b;
   for(int i=1;i<=5;i++){
   System.out.println(a*i+" and "+ b*i + " and " +c );
}
}

public void Addition(int a ,int b,int x){
   c=a+b+x;
   for(int i=1;i<=5;i++){
   System.out.println(a*i +" and "+ b*i + " and " +c );
}
}
public void Addition(int a ,float b){
   c=a+b;
   for(int i=1;i<=5;i++){
   System.out.println(a*i+" and "+ b*i + " and " +c );
}
}
public void Addition(float a ,int b){
   c=a+b;
   for(int i=1;i<=5;i++){
   System.out.println(a*i+" and "+ b*i + " and " +c );
}
}
}

class Day14{
public static void main(String []args){
  sample d=new sample();
  d.Addition(10,30);
 d.Addition(20,50,48);
 d.Addition(56,0.3f);
 d.Addition(0.56f,36);
}
}