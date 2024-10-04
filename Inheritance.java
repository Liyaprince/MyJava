package oopj24csb50;
import java.util.Scanner;
class Employee{
String name;
String address;
int age;
long phone;
float salary;
void printemployee()
{
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Age:"+age);
System.out.println("Phone no:"+phone);
}
void printsalary() {
System.out.println("Salary:"+salary);
}
}
class Manager extends Employee{
String dept;
void printdept() 
{
System.out.println("Department:" +dept);
}
}
class Officer extends Employee
{
String specialization;
void printspecialization() 
{
System.out.println("Specialization:" +specialization);
}
}
public class Inheritance {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Manager m=new Manager();
Officer off= new Officer();
System.out.println("Officer Details");
System.out.println("Enter the name:");
off.name = sc.nextLine();
System.out.println("Enter the address:");
off.address = sc.nextLine();
System.out.println("Enter specialization:");
off.specialization=sc.nextLine();
System.out.println("Enter the age:");
off.age=sc.nextInt();
System.out.println("Enter the phone number:");
off.phone = sc.nextLong();
System.out.println("Enter the salary:");
off.salary=sc.nextInt();
sc.nextLine();
System.out.println(" ");
System.out.println("Manager Details");
System.out.println("Enter the name:");
m.name = sc.nextLine();
System.out.println("Enter the address:");
m.address = sc.nextLine();
System.out.println("Enter the department:");
m.dept=sc.nextLine();
System.out.println("Enter the age:");
m.age=sc.nextInt();
System.out.println("Enter the phone number:");
m.phone = sc.nextLong();
System.out.println("Enter the salary:");
m.salary=sc.nextInt();
System.out.println(" ");
System.out.println("Officer Details:");
off.printemployee();
off.printsalary();
off.printspecialization();
System.out.println(" ");
System.out.println("Manager Details:");
m.printemployee();
m.printsalary();
m.printdept(); 
}
}

