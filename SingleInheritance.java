package javapgm;
class Employee{
	String name;
	int id;
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	void displaydetails() {
		System.out.println("Name: "+ name + "\nEmployee Id: "+id);
	}
}
class Manager extends Employee{
	String department;
		Manager(String name, int id, String department) {
			super(name, id);
	        this.department = department;
	}
	void displaydetails() {
		super.displaydetails();
		System.out.println("Department: " + department);
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Employee e= new Employee("John Doe",17865);
		Manager m = new Manager("Martin Joy",152743,"Sales");
		System.out.println("Employee Details:");
		e.displaydetails();
		System.out.println("\nManager Details:");
		m.displaydetails();
	}
}
