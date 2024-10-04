package javapgm;
import java.util.Scanner;
public class SymmetricMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,flag=0;
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
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(matrix[i][j]==matrix[j][i]) {
					flag=1;
					break;
				}
				else {
					flag=0;
					break;
				}
			}
		}
		if(flag==1) {
			System.out.println("The matrix is symmetric");
		}
		else {
			System.out.println("The matrix is not symmetric");
		}
	}
}
