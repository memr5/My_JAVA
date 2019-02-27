import java.util.Scanner;
interface Stack_Interface{
  boolean isEmpty();
  boolean isFull();
  void insert(int x);
  int delete();
  void display();
}

public class Stack implements Stack_Interface{
  private int[] stack;
  private int size;
  private int top;

  Stack(int size){
    this.size = size;
    stack = new int[size];
    this.top = -1;
  }

  public boolean isEmpty(){
    if(this.top==-1){
      System.out.println("Stack is Empty");
      return true;
    }
    return false;
  }

  public boolean isFull(){
    if(this.top==this.size-1){
      System.out.println("Stack is Full!!");
      return true;
    }
    return false;
  }

  public void insert(int x){
    this.stack[++top] = x;
    System.out.println("Added!!");
  }

  public int delete(){
    int x = stack[top--];
    System.out.println("Deleted!!");
    return x;
  }

  public void display(){
    if(this.isEmpty()){
      return;
    }
    for(int i=0;i<=top;i++){
      System.out.print(this.stack[i]+" ");
    }
  }
  public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    System.out.print("Enter Size of the Stack : ");
    int size = s.nextInt();
    Stack stack = new Stack(size);

    while (true) {
      System.out.print("\n\n>MENU:\n>1.Push\n>2.Pop\n>3.Display\n>4.Exit\n------------\n\nEnter your Choice : ");
      int choice = s.nextInt();

      if(choice==1 && !stack.isFull()){
        System.out.print("Enter number to Push : ");
        int x = s.nextInt();
        stack.insert(x);
      }

      else if(choice==2 && !stack.isEmpty()){
        int x = stack.delete();
        System.out.print("Deleted Element : "+x+"\n");
      }

      else if(choice==3){
        stack.display();
      }

      else if(choice==4){
        break;
      }
      
    }
  }
}
