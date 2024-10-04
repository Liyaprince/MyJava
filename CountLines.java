package myjava;
import java.io.*;
public class CountLines {

	public static void main(String[] args) {
		int i=0;
		try
		{
		FileInputStream fin=new FileInputStream("Line.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
		String line;
		int lineno=0;
		while((line=br.readLine())!=null)
		{
		System.out.println(line);
		lineno++;
		}
		System.out.println("Number of lines:"+lineno);
		}
		catch(Exception e)
		{
		System.out.println("An error occured:"+e.getMessage());
		}
		}
		}
