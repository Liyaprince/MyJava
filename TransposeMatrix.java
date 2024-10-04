package javapgm;
import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row,col,i,j;
		System.out.println("Enter the number of rows in the matrix:");
		row=sc.nextInt();
		System.out.println("Enter the number of columns in the matrix:");
		col=sc.nextInt();
		int[][] matrix = new int[row][col];
		int[][] transposematrix = new int[row][col];
		System.out.println("Enter the elements of the matrix:");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
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
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				transposematrix[i][j]=matrix[j][i];
			}
		}
		System.out.println("Transpose Matrix:");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print(transposematrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
