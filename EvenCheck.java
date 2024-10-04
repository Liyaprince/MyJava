package myjava;
import javapgm.Even;
import java.util.*;
public class EvenCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int a = Even.checknum(num);
		if(a==1) {
			System.out.println("Number " + num+" is even..");
		}
		else {
			System.out.println("Number " + num+" is not even..");
		}
		sc.close();
	}

}
