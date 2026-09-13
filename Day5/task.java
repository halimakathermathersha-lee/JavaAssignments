import java.io.*;
import java.util.*;
class task{
public static void main (String []args){
Scanner s= new Scanner(System.in);
System.out.println("Enter you package:");
int packageA=s.nextInt();

if(packageA < 199)
{
System.out.println("Basic Plan");
}
else if(packageA >=199 && packageA<=399)
{
System.out.println("Standard Plan");
}
else if(packageA >=400 && packageA<=699)
{
System.out.println("premium Plan");
}
else
{
System.out.println("unlimited Plan");
}

}
}