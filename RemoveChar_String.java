package javapgm;
import java.util.Scanner;
public class RemoveChar_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println("Enter the character to be remove:");
		char ch = sc.next().charAt(0);
		String str2= str.replaceAll(String.valueOf(ch),"");
		System.out.println("Replaced string is:" + str2);
		}
}
