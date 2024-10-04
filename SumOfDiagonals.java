package javapgm;
import java.util.Scanner;
public class SumOfDiagonals {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the size of the square matrix:");
		n= sc.nextInt();
		System.out.println("Enter the elements of the matrix:");
		int[][] matrix = new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				matrix [i][j]= sc.nextInt();
			}
		}	
		System.out.println("Matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
		int diagonal1sum=0;
		int diagonal2sum=0;
		for(i=0;i<n;i++) {
			diagonal1sum+=matrix[i][i];
			diagonal2sum+=matrix[i][n-1-i];
		}
		System.out.println("Sum of primary diagonal:" + diagonal1sum);
		System.out.println("Sum of secondary diagonal:" + diagonal2sum);
	}
}
