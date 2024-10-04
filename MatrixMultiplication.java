package javapgm;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row1,col1,row2,col2,i,j;
		System.out.println("Enter the number of rows and columns for matrix 1:");
		row1=sc.nextInt();
		col1=sc.nextInt();
		System.out.println("Enter the number of rows and columns for matrix 2:");
		row2=sc.nextInt();
		col2=sc.nextInt();
		int [][] matrix1=new int[row1][col1];
		int [][] matrix2=new int[row2][col2];
		int [][] matrix3=new int[row1][col2];
		if(row1!=col2)
		{
			System.out.println("Not possible for multiplication...");
		}
		else
		{
			System.out.println("Enter the elements for matrix 1:");
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col1;j++)
				{
					matrix1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the elements for matrix 2:");
			for(i=0;i<row2;i++)
			{
				for(j=0;j<col2;j++)
				{
					matrix2[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col2;j++)
				{
					matrix3[i][j]=0;
					for(int k=0;k<col1;k++)
					{
					matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			System.out.println("matrix 1 :");

			for(i=0;i<row1;i++)
			{
				for(j=0;j<col1;j++)
				{
					System.out.print(matrix1[i][j] + "\t");
				}
				System.out.print("\n");
			}
			System.out.println("matrix 2 :");

			for(i=0;i<row2;i++)
			{
				for(j=0;j<col2;j++)
				{
					System.out.print(matrix2[i][j] + "\t");
				}
				System.out.print("\n");
			}
			System.out.println("Multiplied matrix:");

			for(i=0;i<row1;i++)
			{
				for(j=0;j<col2;j++)
				{
					System.out.print(matrix3[i][j] + "\t");
				}
				System.out.print("\n");
			}
									
		}
		
	}

}