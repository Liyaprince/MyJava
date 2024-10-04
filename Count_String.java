package javapgm;
import java.util.Scanner;
public class Count_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		str=str.toLowerCase();
		int len =str.length();
		int linecount=0,alphacount=0,digitcount=0,spacecount=0,specialcount=0,wordcount=0,charactercount=0;
		int i;
		for(i=0;i<len;i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				alphacount++;
			}
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				digitcount++;
			}
			else if(str.charAt(i)==' ') {
				spacecount++;
			}
			else if(str.charAt(i)=='\n') {
				linecount++;
			}
			else {
				specialcount++;
			}
		}
		charactercount=digitcount+alphacount+specialcount;
		linecount=linecount+1;
		wordcount=spacecount+1;
		System.out.println("Total no.of characters:"+ charactercount);
		System.out.println("Total no.of words:"+ wordcount);
		System.out.println("Total no.of lines:"+ linecount);
		System.out.println("Total no.of alphabets:"+ alphacount);
		System.out.println("Total no.of digits:"+ digitcount);
		System.out.println("Total no.of white spaces:"+ spacecount);
	}
}
