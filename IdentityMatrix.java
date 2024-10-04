package javapgm;
import java.util.Scanner;
public class IdentityMatrix {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the size of the identity matrix:");
		n= sc.nextInt();
		System.out.println("Identity Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print("1" + "\t");
				}
				else {
					System.out.print("0" + "\t");
				}
			}
			System.out.print("\n");
		}		
	}
}
