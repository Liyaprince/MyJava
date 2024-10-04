package oopj24csb50;
import java.util.Scanner;
class Employee2
{
float basicsalary; 
int da,hra;
Employee2(float basicsalary,int da,int hra){
this.basicsalary=basicsalary;
this.da=da;
this.hra=hra;
}
void display() {
System.out.println("...EMPLOYEE...");
}
void calcsalary() {
basicsalary=(basicsalary+basicsalary*da/100+basicsalary*hra/100);
System.out.println("Gross salary of the Employee is:"+basicsalary);
}
}
class Engineer1 extends Employee2{
Engineer1(float basicsalary,int da,int hra){
super(basicsalary,da,hra);
}
void display() {
super.display();
super.calcsalary();
System.out.println("...ENGINEER...");
}
void calcsalary() {
System.out.println("Gross Salary of the Engineer is:"+basicsalary*2);
}
}
public class SuperDemo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the basic salary of Employee:");
float basicsalary=sc.nextFloat();
System.out.println("Enter the DA % of the Employee:");
int da=sc.nextInt();
System.out.println("Enter the HRA % of the Employee:");
int hra=sc.nextInt();
Engineer1 ob =new Engineer1(basicsalary,da,hra);
ob.display();
ob.calcsalary();
}
}