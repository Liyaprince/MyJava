package oopj24csb50;
import java.util.Scanner;
public class Frequency {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
char choice;
do {
System.out.println("Enter a string:");
String str= sc.nextLine();
System.out.println("Enter the character:");
char character= sc.next().toLowerCase().charAt(0);
str=str.toLowerCase();
int l=str.length();
int count=0;
for(int i=0;i<l;i++)
{
if(str.charAt(i)==character) {
count++;
}
}
System.out.println("Number of occurence:" + count);
System.out.println("Do you want to continue?(y/n)");
choice=sc.next().toLowerCase().charAt(0);
sc.nextLine();
}while(choice=='y');
if(choice=='n') {
System.out.println("Exiting...");
}
sc.close();
}
}
