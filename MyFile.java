package oopj24csb50;
import java.io.*;
public class MyFile {

	public static void main(String[] args) throws IOException {
		String source="Welcome to the world of Java";
		File f = new File("test.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter("test.txt");
		fw.write(source);
		fw.close();
		FileReader fr = new FileReader("test.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}
}
	