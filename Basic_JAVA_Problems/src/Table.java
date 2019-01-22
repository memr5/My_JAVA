import java.util.Scanner;

public class Table {
    public static void tableOf(int n){
        for(int i =1 ; i<= 10 ; i ++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }

    }
    public static void main(String[] args){
        System.out.print("Enter number :");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        tableOf(t);
    }
}
