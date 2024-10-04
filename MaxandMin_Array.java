package javapgm;
import java.util.Scanner;
public class MaxandMin_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n= sc.nextInt();
		int i;
		int [] array= new int[n];
		System.out.println("Enter the Elements:");
		for(i=0;i<n;i++) {
			array[i]= sc.nextInt();
		}
		int max=array[0];
		for(i=1;i<n;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("Maximum element is:" + max);
		int min=array[0];
		for(i=1;i<n;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("Minimum element is:" + min);
	}
}
