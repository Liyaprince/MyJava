package javapgm;
import java.util.Scanner;
public class ReverseOfString {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int i;
		int len =str.length();
		String rev = new String();
		for(i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of the string:" + rev);
	}
}
