package myjava;
import java.util.*;
public class NumberException {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0,c=0;
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The numbers are:");
		for(int i=0;i<n;i++) {
			try {
			if(arr[i]>0) {
				System.out.println(arr[i]);
				sum=sum+arr[i];
				c++;
			}
			else {
				throw new InvalidNumberException("Invalid number:"+arr[i]);
			}
		}catch(InvalidNumberException e) {
			System.out.println(e.getMessage());
		}
		}
		if(c>0) {
			System.out.println("The sum of positive numbers is:"+sum);
			float avg=sum/c;
			System.out.println("The average is:"+avg);
		}
	}
}
