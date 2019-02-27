import java.util.Scanner;
interface Stack_Interface{
  boolean isEmpty();
  boolean isFull();
  void insert(int x);
  int delete(int x);
  void display();
}

public class Stack implements Stack_Interface{
  private int[] stack;
  private int size;
  private top;

  Stack(int size){
    this.size = size;
    stack = new int[size];
    this.top = -1;
  }

  boolean isEmpty(){
    if(this.top==-1){
      System.out.println("Stack is Empty");
      return true;
    }
    return false;
  }

  boolean isFull(){
    if(this.top==this.size-1){
      System.out.println("Stack is Full!!");
      return true;
    }
    return false;
  }

  void insert(int x){
    if(this.isFull()){
      return;
    }
    this.stack[++top] = x;
    System.out.println("Added!!");
  }

  int delete(){
    if(this.isEmpty()){
      System.out.println("Stack is Empty!!");
      return;
    }
    int x = stack[top--];
    System.out.println("Deleted!!");
    return x;
  }

  void display(){
    if(this.isEmpty()){
      return;
    }
    for(int i=0;i<=top;i++){
      System.out.print(this.stack[i]+" ");
    }
  }
  public static void main(String[] args){
    int size = 5;
    Stack stack = new Stack(size);

    Scanner s = new Scanner(System.in);
    System.out.println("Enter ");
  }
}
