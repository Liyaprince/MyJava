package javapgm;
import java.util.Scanner;
public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n= sc.nextInt();
		int sum=0;
		int [] array= new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0;i<n;i++) {
			array[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum+=array[i];
		}
		System.out.println("Sum of the elements:" + sum);
	}
}
