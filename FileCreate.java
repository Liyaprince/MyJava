package oopj24csb50;
import java.io.*;
import java.util.Scanner;
public class FileCreate {
	public static void main(String[] args)throws IOException {

		Scanner sc=new Scanner(System.in);
		String cont;

		try {

            File f = new File("Sample.txt");

            if (f.exists()) {

                System.out.println("Sample.txt exists");

            } else {

                f.createNewFile();

                System.out.println("Sample.txt created");

            }

            System.out.println("Enter the String");

            cont=sc.nextLine();
            FileWriter fw=new FileWriter("Sample.txt");

            fw.write(cont);
            fw.close();
            System.out.println("Content written to Sample.txt.");
	}catch(IOException e) {

		 System.out.println("Error occured");

	}

		try {

			File f1 = new File("new-sample.txt");

            if (f1.exists()) {

                System.out.println("new-sample.txt exists");

            } else {

                f1.createNewFile();

                System.out.println("new-sample.txt created");

            }
		}catch(IOException e) {

			 System.out.println("Error occured");

		}

		 try {

	            File f1 = new File("Sample.txt");

	            FileReader fr=new FileReader("Sample.txt");

	            int i;

	            System.out.println("---Contents of Sample.txt---");

	            while((i=fr.read())!=-1) {

	            	System.out.print((char)i);

	            }

	            fr.close();
		 }catch(IOException e) {

			 System.out.println("Error occured");
		 }

		 try {

			 FileWriter fw1=new FileWriter("new-sample.txt");

			 FileReader fr=new FileReader("Sample.txt");

			 int c;

	         while ((c = fr.read()) != -1) {

	            fw1.write(c);

	         }

	         fr.close();

	         fw1.close();

	         System.out.println("\nContent copied from Sample.txt to new-Sample.txt");

		 }catch(IOException e) {

			 System.out.println("Error occured");
		 }
		 try {

			 File f1 = new File("new-sample.txt");

			 FileReader fr1=new FileReader("new-sample.txt");

	            int i;

	            System.out.println("---Contents of new-sample.txt---");

	            while((i=fr1.read())!=-1) {

	            	System.out.print((char)i);

	            }

	            fr1.close();
		 }catch(IOException e) {

			 System.out.println("Error occured");
		 }

	sc.close();	

	}

}
