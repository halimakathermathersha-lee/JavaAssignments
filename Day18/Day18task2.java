import java.io.*;
import java.util.*;
class Day18task2{
public static void main(String []a){
System.out.println("Enter anything");
Scanner s=new Scanner(System.in);
String word=s.nextLine();
char []mine=word.toCharArray();
int count=0;


for(char m:mine){
if(m=='a' ||m=='e' ||m=='i' ||m=='o' ||m=='u'){
System.out.println(m);
count++;
}
}

System.out.println("Number of Vowels:"+count);
}
}