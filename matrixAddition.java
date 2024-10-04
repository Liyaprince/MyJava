package javapgm;
import java.util.Scanner;
public class matrixAddition {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row1,col1,row2,col2,i,j,k;
		System.out.println("Enter the number of rows for matrix1:");
		row1=sc.nextInt();
		System.out.println("Enter the number of columns for matrix1:");
		col1=sc.nextInt();
		System.out.println("Enter the number of rows for matrix2:");
		row2=sc.nextInt();
		System.out.println("Enter the number of columns for matrix2:");
		col2=sc.nextInt();
		int[][] matrix1 = new int[row1][col1];
		int[][] matrix2 = new int[row2][col2];
		int[][] matrix3 = new int[row1][col1];
		if(row1!=row2 || col1!=col2)
		{
			System.out.println("Not eligible for addition...");
		}
		else {
		System.out.println("Enter the elements of the matrix1:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the matrix2:");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix1:");
		for(i=0;i<row1;i++){
			for(j=0;j<col1;j++){
				System.out.print(matrix1[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("Matrix2:");
		for(i=0;i<row2;i++){
			for(j=0;j<col2;j++){
				System.out.print(matrix2[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("Sum of the matrices:");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("Matrix1:");
		for(i=0;i<row1;i++){
			for(j=0;j<col1;j++){
				System.out.print(matrix3[i][j] + "\t");
			}
			System.out.print("\n");
		}
		}	
	}
}
