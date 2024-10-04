package myjava;
import java.io.*;
public class FileExist {
	public static void main(String[] args) throws IOException {
		String content="Smitha is your Java teacher";
		File f1= new File("file1.txt");
		File f2= new File("file2.txt");
		try {
			if(f1.exists()) {
				System.out.println("file1 exists");
				FileOutputStream fout= new FileOutputStream(f1);
				fout.write(content.getBytes());
				fout.close();
			}
			else {
				System.out.println("file1 not exists..");
			}
		}catch(Exception e) {
			System.out.println("an error occured:"+e.getMessage());
		}		
		if(f2.exists()) {
			System.out.println("file2 exists");
			try {
			FileInputStream fin= new FileInputStream(f1);
			FileOutputStream fout= new FileOutputStream(f2);
			System.out.println("File contents copied from file1 to file2");
			int c;
			while((c=fin.read())!=-1) {
				fout.write(c);
			}
			fin.close();
			fout.close();
			String l;
			System.out.println("**file contents of file1**");
			BufferedReader br1= new BufferedReader(new FileReader(f1));
			while((l=br1.readLine())!=null) {
				System.out.println(l);
			}
			br1.close();
			System.out.println("**file contents of file2**");
			BufferedReader br2= new BufferedReader(new FileReader(f2));
			while((l=br2.readLine())!=null) {
				System.out.println(l);
			}
			br2.close();
		}catch(Exception e) {
		System.out.println("an error occured:"+e.getMessage());
	}	
			}
		else {
			System.out.println("file2 not exists..");
		}
	}	
	}
