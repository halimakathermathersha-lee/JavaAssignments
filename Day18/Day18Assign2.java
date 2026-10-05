import java.io.*;
class Day18Assign2{
public static void main(String []args){
String a="halima";
char []b=a.toCharArray();
for(int i=0;i<b.length;i++){
   for(int j=i+1;j<b.length;j++){

      if(b[i]>b[j]){

      char temp=b[i];
      b[i]=b[j];
      b[j]=temp;

}
}
}
String result=new String(b);
System.out.println(result);
}
}