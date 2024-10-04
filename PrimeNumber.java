package javapgm;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,count;
		System.out.println("Prime numbers between 1 and 100:");
		for(i=2;i<=100;i++) {
			count=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
		if(count==0)
		{
			System.out.print(i + " ");
		}
		}		
	}
}
