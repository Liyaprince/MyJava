package myjava;
import java.util.Scanner;
public class HotelRoom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter slot number:");
			int n=sc.nextInt();
			try {
				if(n<=0) {
					throw new InvalidReservationException("Invalid slot Number...");
				}
				else {
					System.out.println("Your slot is registered..");
				}
			}catch(InvalidReservationException e) {
				System.out.println(e.getMessage());
			}
	}
}
