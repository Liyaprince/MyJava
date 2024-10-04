package javapgm;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,fact=1,i=1;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+ n +" is " + fact);
	}
}
