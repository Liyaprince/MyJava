package javapgm;
import java.util.Scanner;
class Employee2{
	String name;
	int id;
	void displaydetails() {
		System.out.println("Name: "+ name + "\nEmployee Id: "+id);
	}
}
class Manager1 extends Employee2{
	String department;
	void displaydepart() {
		System.out.println("Department: " + department);
	}
	String method;
	void displaymethods() {
		System.out.println("Method to manage employees:"+ method);
	}
}
public class SingleInheritance1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Employee2 ob1=new Employee2();
		Manager1 ob2=new Manager1();
		System.out.println("Employee Details");
		System.out.println("Enter the name:");
		ob1.name = sc.nextLine();
		System.out.println("Enter the employee id:");
		ob1.id = sc.nextInt();
		
		System.out.println("Manger Details");
		sc.nextLine();
		System.out.println("Enter the name:");
		ob2.name = sc.nextLine();
		System.out.println("Enter the department:");
		ob2.department = sc.nextLine();
		System.out.println("Enter a method to manage employees:");
		ob2.method = sc.nextLine();
		System.out.println("Enter the employee id:");
		ob2.id = sc.nextInt();
		sc.close();
		
		System.out.println("\nEmployee Details:");
		ob1.displaydetails();
		System.out.println("\nManger Details:");
		ob2.displaydetails();
		ob2.displaydepart();
		ob2.displaymethods();
	}
}
