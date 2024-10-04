package oopj24csb50;
import java.util.Scanner;
abstract class Shape{
abstract void numberofsides();
}
class Rectangle extends Shape{
int side;
Rectangle(int side){
this.side=side;
}
void numberofsides() {
System.out.println("Shape with "+ side+" sides.");
System.out.println("I am a Rectangle.I have "+side+" sides.");
System.out.println("Sum of the angles= " +(side-2)*180);
}
}
class Triangle extends Shape{
int side;
Triangle(int side){
this.side=side;
}
void numberofsides() {
System.out.println("Shape with "+ side+" sides.");
System.out.println("I am a Triangle.I have "+side+" sides.");
System.out.println("Sum of the angles= " +(side-2)*180);
}
}
class Hexagon extends Shape{
int side;
Hexagon(int side){
this.side=side;
}
void numberofsides() {
System.out.println("Shape with "+ side+" sides.");
System.out.println("I am a Hexagon.I have "+side+" sides.");
System.out.println("Sum of the angles= " +(side-2)*180);
}
}
public class Abstract {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String choice;
do {
System.out.println("Enter the number of sides for the geometrical shape:");
int side=sc.nextInt();
if(side==4) {
Rectangle r = new Rectangle(4);
r.numberofsides();
} 
else if(side==3) {
Triangle t= new Triangle(3);
t.numberofsides();
}
else if(side==6) {
Hexagon h= new Hexagon(6);
h.numberofsides();
} 
else {
System.out.println("Shape with "+ side+" is not supported..");
} 
System.out.println("Do you want to continue(y/n):");
sc.nextLine();
choice=sc.nextLine();
}while(choice.toLowerCase().equals("y"));
if(choice.toLowerCase().equals("n")) {
System.out.println("Exiting program...Good bye!");
}
}
}
