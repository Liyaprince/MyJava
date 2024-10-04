package javapgm;
import java.util.Scanner;
abstract class Employeee{
	abstract void calculatemonthsalary();
	String name;
	String type;
	Employeee(String name,String type){
		this.name=name;
		this.type=type;
	}
	public String getName() {
		return name;
	}
}
class FullTimeEmployee1 extends Employeee{
		int salary;
		int hra=1000;
		FullTimeEmployee1(String name,int salary){
			super(name,"Fulltime");
			this.salary=salary;	
	}
		void calculatemonthsalary() {
			salary=salary+hra;
			System.out.println(name+"'s Salary: Rs."+salary);
		}
}
class PartTimeEmployee1 extends Employeee{
	int hourlywage;
	int noofhours;
	PartTimeEmployee1(String name,int hourlywage,int noofhours){
		super(name,"Parttime");
		this.hourlywage=hourlywage;
		this.noofhours=noofhours;
	}
	void calculatemonthsalary() {
		hourlywage=hourlywage*noofhours*25;
		System.out.println(name+"'s salary: Rs."+hourlywage);
	}
}
class Intern extends Employeee{
	int stipend;
	Intern(String name,int stipend){
		super(name,"Intern");
		this.stipend=stipend;
	}
	void calculatemonthsalary() {
		System.out.println(name+"'s stipend: Rs."+stipend);
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String choice;
		do {
		System.out.println("Enter employee's name:");
		String name=sc.nextLine();
		System.out.println("Enter employee's job type(full-time,part-time,intern):");
		String type=sc.nextLine();
		if(type.toLowerCase().equals("full-time")) {
		System.out.println("Enter the monthly salary:");
		int salary=sc.nextInt();
		FullTimeEmployee1 f = new FullTimeEmployee1(name,salary);
		f.calculatemonthsalary();
		}
		else if(type.toLowerCase().equals("part-time")) {
			System.out.println("Enter hourly wage:");
			int hourlywage=sc.nextInt();
			System.out.println("Enter number of hours worked/day:");
			int noofhours=sc.nextInt();
			PartTimeEmployee1 p = new PartTimeEmployee1(name,hourlywage,noofhours);
			p.calculatemonthsalary();
			}
		else if(type.toLowerCase().equals("intern")) {
			System.out.println("Enter the stipend amount:");
			int stipend=sc.nextInt();
			Intern i = new Intern(name,stipend);
			i.calculatemonthsalary();
		}
		System.out.println("Do you want to continue(y/n):");
		sc.nextLine();
		choice=sc.nextLine();
		}while(choice.toLowerCase().equals("y"));
		if(choice.toLowerCase().equals("n"));{
			System.out.println("Exiting...");
		}
}}