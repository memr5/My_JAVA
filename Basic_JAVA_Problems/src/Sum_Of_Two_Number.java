import java.util.Scanner;

public class Sum_Of_Two_Number {
    public  void SumOfNumber(int a,int b){
        int c = a+b;

        System.out.println("Sum of a + b = " + c + "\nWhen a = " + a + " And b = " + b );
    }
    public static void main(String[] arg){
        Sum_Of_Two_Number sum = new Sum_Of_Two_Number();
        sum.SumOfNumber(10,20); //Sum of Number by give Number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of a : ");
        int e = sc.nextInt();
        System.out.print("Enter Value of b : ");
        int f = sc.nextInt();
        sum.SumOfNumber(e,f); // Sum of Number by console
    }
}
