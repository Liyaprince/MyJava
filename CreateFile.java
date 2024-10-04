package myjava;
import java.io.*;
public class CreateFile {
	public static void main(String[] args) throws IOException {
		File f = new File("myFile.txt");
		f.createNewFile();
		String source="This is the University exam for OODP.\nThis is a program to illustrate the use of files. ";
		FileWriter fw = new FileWriter("MyFile.txt");
		fw.write(source);
		fw.close();
		FileReader fr = new FileReader("MyFile.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}
}
