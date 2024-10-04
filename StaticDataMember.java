package javapgm;
class Student
{	int rollno;
	String name;
static String college="SJC";
Student(int r,String n)
	{rollno=r;
	name=n;
	}
void display()
	{
	System.out.println(rollno+"\t"+name+"\t "+college);
	}
}
public class StaticDataMember {
public static void main(String[] args) 
{
	System.out.println("Rollno"+"\t"+"Name"+"\t "+"College");
	Student s1=new Student(111,"Aryan");
	Student s2=new Student(112,"Karan");
	Student s3= new Student(113,"Akhil");
	s1.display();
	s2.display();
	s3.display();
}
}