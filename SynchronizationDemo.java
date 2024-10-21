package oopj24csb50;
import java.util.*;

class A extends Thread{
	int num1;
	A(int num1){
		this.num1=num1;
	}
	public void run() {
		synchronized(A.class) {
		for(int i=1;i<=10;i++) {
			System.out.println(num1+ " + "+i+ " = "+ (num1+i));}
	}}
}
public class SynchronizationDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		A ob1=new A(num1);
		A ob2=new A(num2);
		A ob3=new A(num3);
		ob1.start();
		ob3.start();
		ob2.start();
		sc.close();
	}
}
