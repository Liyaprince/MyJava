package javapgm;
import java.util.Scanner;
public class Reverse_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,rev=0,i,rem;
		System.out.println("Enter the number:");
		n= sc.nextInt();
		for(i=0;i<n;i++) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reversed number:" + rev);
	}

}
