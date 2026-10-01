import java.io.*;
class sample{
  public void icon(){
   System.out.println("icon");
}
}

class sample1 extends sample{
  public void icon(){
   System.out.println("fly");
}
}
class Day14task{
public static void main(String []args){
  sample s=new sample1();
  s.icon();
}
}