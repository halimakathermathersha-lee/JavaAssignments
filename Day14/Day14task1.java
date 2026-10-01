import java.io.*;
abstract class sample{
  public abstract void icon();
}

class sample1 extends sample{
  public void icon(){
   System.out.println("fly");
}
}
class Day14task1{
public static void main(String []args){
  sample s=new sample1();
  s.icon();
}
}