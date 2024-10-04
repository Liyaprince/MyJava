package oopj24csb50;
import java.util.*;
abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	abstract void eat();
	void walk() {
		System.out.println("This animal walks by "+legs +" legs");
	}
}
class Spider extends Animal{
	Spider(int legs){
		super(legs);		
	}
	void eat() {
		System.out.println("Spider eats insects");
	}
}
interface Pet{
	abstract void getname();
	abstract void play();
	abstract void setname(String name);
}
class Cat extends Animal implements Pet{
	String name;
	Cat(String name,int legs){
		super(legs);
		this.name=name;
		}
	public void getname() {
		System.out.println("The cat's name is " +name );
	}
	public void play() {
		System.out.println("Cat plays with rat." );
	}
	public void setname(String name) {
		this.name=name;
	}
	void walk() {
		System.out.println("This animal walks by "+legs +" legs");
	}
	void eat() {
		System.out.println("Cat eat fishes.");
	}
}
class Fish extends Animal implements Pet{
	String name;
	Fish(String name,int legs){
		super(legs);
		this.name=name;
		}
	public void getname() {
		System.out.println("The fish's name is " +name );
	}
	public void setname(String name) {
		this.name=name;
	}
	public void play() {
		
	}
	void walk() {
		System.out.println("Fish has no legs");
	}
	void eat() {
		System.out.println("Fish eat plants.");
	}
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
	Fish f = new Fish("Mimi",0);
	System.out.println("FISH");
	f.getname();
	f.walk();
	f.eat();
	f.setname("Momo");
	f.getname();
	System.out.println(" ");
	
	Cat c = new Cat("Fluffy",4);
	System.out.println("CAT");
	c.getname();
	c.walk();
	c.play();
	c.eat();
	c.setname("Moose");
	c.getname();
	System.out.println(" ");
	
	Spider s= new Spider(8);
	System.out.println("SPIDER");
	s.walk();
	s.eat();
	System.out.println(" ");
	
	}

}