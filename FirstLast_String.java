package javapgm;
import java.util.Scanner;
public class FirstLast_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = sc.nextLine();
		str1=str1.toLowerCase();
		int len=str1.length();
		String c1=str1.substring(0,1);
		String c2=str1.substring(len-1);
		boolean result=c1.equals(c2);
		String str2=str1.substring(1,len-1);
		if(result==true) {
			System.out.println(str2);
			System.out.println("First and last characters are same...");
		}
		else {
			System.out.println(str1);
		}
	}
}
