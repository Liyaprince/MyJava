package javapgm;
import java.util.Scanner;
class Employee3{
	String name;
	int age;
	int id;
	void display() {
		System.out.println("Name: "+ name + "\nage: " + age + "\nEmployee Id: "+id);
	}
}
class FullTimeEmployee extends Employee3{
	int annualsalary;
	void display1() {
		System.out.println("annual salary: " + annualsalary);
	}
}
class PartTimeEmployee extends Employee3{
	int hourlyrate;
	void display2() {
		System.out.println("Hourly rate: " + hourlyrate);
	}
}
public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FullTimeEmployee ob2=new FullTimeEmployee();
		PartTimeEmployee ob3=new PartTimeEmployee();
		System.out.println("Full Time Employee Details");
		System.out.println("Enter the name:");
		ob2.name = sc.nextLine();
		System.out.println("Enter the age:");
		ob2.age = sc.nextInt();
		System.out.println("Enter the employee id:");
		ob2.id = sc.nextInt();
		System.out.println("Enter the Annual Salary:");
		ob2.annualsalary = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Part Time Employee Details");
		System.out.println("Enter the name:");
		ob3.name = sc.nextLine();
		System.out.println("Enter the age:");
		ob3.age = sc.nextInt();
		System.out.println("Enter the employee id:");
		ob3.id = sc.nextInt();
		System.out.println("Enter the hourly rate:");
		ob3.hourlyrate = sc.nextInt();
		sc.nextLine();
		System.out.print("\n");
		
		System.out.println("Full Time Employee Details:");
		ob2.display();
		ob2.display1();
		System.out.println("\nPart Time Employee Details:");
		ob3.display();	
		ob3.display2();
		sc.close();
	}
}
