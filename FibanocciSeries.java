package javapgm;
import java.util.Scanner;
public class FibanocciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the limit:");
		n= sc.nextInt();
		System.out.println("Fibanocci Series:");
		int num1=0;
		int num2=1;
		int i=1;
		while(i<=n) {
			System.out.print(num1 + "\t");
			int nextnum=num1+num2;
			num1=num2;
			num2=nextnum;
			i++;
		}
	}
}
