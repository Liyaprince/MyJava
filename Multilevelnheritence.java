package javapgm;
import java.util.Scanner;
class Vehicle{
	String model;
	int year;
	void display() {
		System.out.println("Model:"+ model + "\nYear:"+year);
	}
}
class Car extends Vehicle{
	int numberofdoors;
	void display1() {
		System.out.println("Number of doors :" + numberofdoors);
	}
}
class ElectricCar extends Car{
	int batterycapacity;
	void display2() {
		System.out.println("Battery Capacity:" + batterycapacity +" Kwh");
	}
}
public class Multilevelnheritence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehicle v = new Vehicle();
		Car c= new Car();
		ElectricCar e = new ElectricCar();
		System.out.println("Enter the model of the vehicle:");
		v.model = sc.nextLine();
		System.out.println("Enter the Year:");
		v.year = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the number of doors:");
		c.numberofdoors = sc.nextInt();
		System.out.println("Enter the battery capacity:");
		e.batterycapacity = sc.nextInt();
		System.out.print("\n");
		v.display();
		c.display1();
		e.display2();
	}
}
