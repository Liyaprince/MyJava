package javapgm;
import java.util.*;
class A{
int item,n,top;
    int[] arr;
    A(int n) {
        this.n = n;
        this.top = -1;
        this.arr= new int[n];
    }
    void push(int item){
        if(top>=n-1){
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            this.item=item;
            arr[top]=item;
        }
    }
    void pop(){
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println("the deleted element is: "+arr[top]);
            top--;
        }
    }
    void full(){
        if(top==n-1){
            System.out.println("Stack is full");
        }
        else{
            System.out.println("Stack is not full");
        }
    }
    void empty(){
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");} 
        }
    }
public class Stack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c;
        int choice;
        System.out.print("Enter the size of the stack:");
        int size=sc.nextInt();
        A ob=new A(size);
        do{
            System.out.print("Stack operations");
            System.out.println("\n1.push\n2.pop\n3.IsFull\n4.IsEmpty");
            System.out.print("Enter the choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the element to be inserted:");
                    int item=sc.nextInt();
                    ob.push(item);
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.full();
                    break;
                case 4:
                    ob.empty();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.print("Do you want to continue or not(Y/N): ");
            c=sc.next().charAt(0);
        }while(c=='y'||c=='Y');
        System.out.println("Exiting...");
}
}

