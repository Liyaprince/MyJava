package oopj24csb50;
import java.io.*;
public class FileDemo {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the content:");
			String content= br.readLine();
			FileWriter f1= new FileWriter("test.txt",true);
			f1.write("\n");
			f1.write(content);
			System.out.println("Contents added into the file..");
			f1.flush();
			f1.close();
			FileReader fr = new FileReader("test.txt");
			System.out.println("File contents are:");
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
		}catch(IOException e) {
			System.out.println("An error occured.."+e.getMessage());
		}
	}
}
