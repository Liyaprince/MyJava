package myjava;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score:");
		int score=sc.nextInt();
		try {
			if(score<0||score>100) {
				throw new InvalidScoreException("Score must be between 0 and 100..");
			}
			else {
				System.out.println("Score of student:"+score);
			}
		}catch(InvalidScoreException e) {
			System.out.println(e.getMessage());
		}

	}
}
