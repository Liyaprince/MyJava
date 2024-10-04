package javapgm;
import java.util.Scanner;
public class MultiplyElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row,col,i,j,k;
		System.out.println("Enter the number of rows in thhe 2D matrix:");
		row=sc.nextInt();
		System.out.println("Enter the number of columns in the 2D matrix:");
		col=sc.nextInt();
		int[][] matrix = new int[row][col];
		System.out.println("Enter the elements of the matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				matrix [i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("Enter the scalar value to multiply with matrix:");
		k=sc.nextInt();
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				matrix[i][j]=matrix[i][j]*k;
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
