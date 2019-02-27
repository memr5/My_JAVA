import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name :");
        String name = sc.nextLine();
        System.out.println("Hello " +name+ ", Nice to meet you");
        System.out.print("Changes!!");
    }
}
