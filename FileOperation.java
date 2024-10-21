package oopj24csb50;
import java.io.*;
import java.util.*;
	public class FileOperation {
	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        int n = 0;
	        int[] arr = null;
	        try {
            File num = new File("number.txt");
	            if (num.exists()) {
	                System.out.println("number.txt exists");
	            } else {
	                num.createNewFile();
	                System.out.println("number.txt created");
	            }
	            System.out.println("Enter the Limit:");
	            n = sc.nextInt();
	            arr = new int[n];
	            System.out.println("Numbers are:");
	            for (int i = 0; i < n; i++) {
	                arr[i] = sc.nextInt();
	            }
	            FileOutputStream fos = new FileOutputStream("number.txt");
	            for (int i = 0; i < n; i++) {
	                String numStr = arr[i] + "\n";
	                fos.write(numStr.getBytes());
	            }

	            System.out.println("Numbers have been inserted successfully into number.txt");
	            fos.close();
	            FileInputStream fis = new FileInputStream("number.txt");

	            int i;
	            System.out.println("---Elements in number.txt---");
	            while ((i = fis.read()) != -1) {
	                System.out.print((char) i);
	            }
	            fis.close();
	        } catch (IOException e) {

	            System.out.println("Error occurred");
	        }
	        try {
	            File od = new File("odd.txt");
	            if (od.exists()) {
	                System.out.println("odd.txt exists");
	            } else {
	                od.createNewFile();
	                System.out.println("odd.txt created");
	            }
	            FileOutputStream fos1 = new FileOutputStream("odd.txt");

	            for (int i = 0; i < n; i++) {

	                if (arr[i] % 2 != 0) {
	                    String numStr = arr[i] + "\n";
	                    fos1.write(numStr.getBytes());
	                }
	            }
	            System.out.println("Odd numbers have been inserted successfully into odd.txt");
	            fos1.close();
	            FileInputStream fis1 = new FileInputStream("odd.txt");
	            int i;
	            System.out.println("---Elements in odd.txt---");
	            while ((i = fis1.read()) != -1) {
	                System.out.print((char) i);
	            }
	            fis1.close();
	        } catch (IOException e) {
	           System.out.println("Error occurred");
	        }
	        try {
	            File ev = new File("even.txt");
	            if (ev.exists()) {
	                System.out.println("even.txt exists");
	            } else {
	                ev.createNewFile();
	                System.out.println("even.txt created");
	            }
	            FileOutputStream fos2 = new FileOutputStream("even.txt");
	            for (int i = 0; i < n; i++) {
	                if (arr[i] % 2 == 0) {
	                    String numStr = arr[i] + "\n";
	                    fos2.write(numStr.getBytes());
	                }
	            }
	            System.out.println("Even numbers have been inserted successfully into even.txt");
	            fos2.close();
	            FileInputStream fis2 = new FileInputStream("even.txt");
	            int i;
	            System.out.println("---Elements in even.txt---");
	            while ((i = fis2.read()) != -1) {
	                System.out.print((char) i);
	            }
	            fis2.close();
	        } catch (IOException e) {
	            System.out.println("Error occurred");
	        }
	        sc.close();

	    }

	}