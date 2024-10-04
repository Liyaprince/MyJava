package oopj24csb50;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,j;
System.out.println("Enter the string");
String str1= sc.nextLine();
int len = str1.length();
String rev=new String();
for(i=len-1;i>=0;i--)
{
rev=rev+str1.charAt(i);
}
System.out.println("Reverse:"+rev);
if(str1.equals(rev))
{
System.out.println(rev + " is palindrome.");
}
else
{
System.out.println(str1 + " is not palindrome.");
}
}
}
