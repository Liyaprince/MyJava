package oopj24csb50;
import java.util.*;
public class ExceptionDemo {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String choice="y";
	do {
	System.out.println("1.ArithmeticException\n2.ArratIndexOutOfBondsException");
	System.out.println("Enter your choice:");
	int option=sc.nextInt();
	switch(option) {
	case 1:
		System.out.println("Enter Number 1:");
	int a1=sc.nextInt();
	System.out.println("Enter Number2:");
	int b1=sc.nextInt();
	try {
		int div=a1/b1;
		System.out.println("Result="+div);
		System.out.println("End of try block");
	}catch(ArithmeticException e) {
		System.out.println("Exception Thrown:"+e);
	}
	finally {
	System.out.println("Finally Block content");
	System.out.println("My code is safe from exception");}
	break;
	
		
	case 2:
	System.out.println("Enter the number of elements you want to store:");
	int s=sc.nextInt();
	int arr[]=new int[s];
	System.out.println("Enter the elements of the array:");
	for(int i=0;i<s;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Array length:"+s);
	System.out.println("Array elements are:");
	for(int i=0;i<s;i++) {
		System.out.print(arr[i]+"\t");
	}
	System.out.print("\n");
		System.out.println("Enter the position of element to be accessed:");
		int pos=sc.nextInt();
		try {
			System.out.println("Element is:"+arr[pos]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds");}}
			System.out.println("Do You Want to Continue(y/n):");
			sc.nextLine();
			choice=sc.nextLine();
			
	
	}while(choice.equalsIgnoreCase("y"));
		if (choice.equalsIgnoreCase("n") ){
			System.out.println("Exiting...");
		}
	}}