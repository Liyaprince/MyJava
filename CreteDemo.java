package myjava;
import java.io.File;
import java.io.IOException;
public class CreteDemo {

	public static void main(String[] args) throws IOException {
		File f1= new File("file1.txt");
		f1.createNewFile();
		File f2= new File("file2.txt");
		f2.createNewFile();
		File b1=new File("Binary1.bin");
		b1.createNewFile();
		File b2=new File("Binary2.bin");;
		b2.createNewFile();
		File f=new File("Line.txt");
		f.createNewFile();
	}

}
