package javapgm;
import java.util.Scanner;
class Employee1{
	int salary;
	void display() {
		System.out.println("Name of the class is Employee");
	}
	void calcsalary() {
		System.out.println("Salary of Employee is:"+salary);
	}
}
class Engineer extends Employee1{
	void display1() {
		System.out.println("Name of the class is Engineer");
	}
	void calcsalary() {
		System.out.println("Salary of Engineer is:"+salary*2);
	}
}
public class EmployeeAndManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Engineer ob= new Engineer();
		System.out.println("Enter the salary of employee:");
		ob.salary = sc.nextInt();
		ob.calcsalary();
		ob.display();
	}
}
