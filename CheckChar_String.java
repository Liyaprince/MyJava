package javapgm;
import java.util.Scanner;
public class CheckChar_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		String first=str.substring(0,2);
		String last=str.substring(len-2);
		boolean result=first.equals(last);
		if(result==true) {
			System.out.println("The characters "+first+" appears at the end of the string");
		}
		else {
			System.out.println("The characters "+first+" donot appears at the end of the string");
		}
	}
}
