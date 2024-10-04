package oopj24csb50;
import java.util.Scanner;
public class MethodOverloading {
void calculateArea(float a,float b ) {
float area=.5f*a*b;
System.out.println("Area of triangle :" + area);
}
void calculateArea(int a,int b ) {
int area=a*b;
System.out.println("Area of rectangle :" + area); }
void calculateArea(double a) {
double area= (3.14*a*a);
System.out.println("Area of circle :" + area); } 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
MethodOverloading area = new MethodOverloading();
System.out.println("Enter base of the triangle:");
float base=sc.nextFloat();
System.out.println("Enter height of the triangle:");
float height = sc.nextFloat();
System.out.println("Enter width of the rectangle:");
int width=sc.nextInt();
System.out.println("Enter length of the rectangle:");
int length=sc.nextInt();
System.out.println("Enter radius of the circle:");
double radius=sc.nextDouble();
area.calculateArea(base,height);
area.calculateArea(width,length);
area.calculateArea(radius);
}
}
