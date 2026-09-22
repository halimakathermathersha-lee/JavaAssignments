import java.io.*;
import java.util.*;
class sample{

public void Addition(){
int n=5;
for(int i=1;i<=10;i++){
System.out.println("5 * "+ i + " = " + n*i);
}
}

public float Average(){
int[] arrmark={80,68,80,79,68};
int sum=0;
for(int j=0;j<arrmark.length;j++){
  sum=sum+arrmark[j];
}
return (float)sum/arrmark.length;
}


public void palindromecheck(int num){
int r=0;
int s=0;
int temp=num;
while(num>0){
r=num%10;//1//2//1
s+=r;//1//12//121
if(num<9){
s*=10;//120
}
num/=10;//12
}

if(s==temp){
System.out.println("The given number is "+ temp +" is palindrome");
}
else{
System.out.println("The given number is "+ temp +" is not a palindrome");
}
}

public float discountcalculate(float Price,float Percentage){
  float disamt=Price*Percentage/100;//100*10/100=10
  return Price-disamt;//100-10=90
  
}
}

class Day9assignment{
public static void main (String []args){
sample s1=new sample();

s1.Addition();
float percentage=s1.Average();

System.out.println();
System.out.println(percentage);

System.out.println();
s1.palindromecheck(5567);

System.out.println();
float amt=s1.discountcalculate(100,10);
System.out.println("You discounted amount is " +amt );
}
}



