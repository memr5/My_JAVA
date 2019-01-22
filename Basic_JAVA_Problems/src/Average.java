import java.util.Scanner;

public class Average {

    public static int sumOfNumber(int [] number ){
        int sum = 0;
        for(int  i=0 ; i< number.length ; i++) {
            sum = sum + number[i];
        }
        return sum;
    }

    public static void average_Of_N_Numbers(int n){
        Scanner sc = new  Scanner(System.in);
        int [] number = new int[n];
        for(int i = 0 ; i<n ; i++){
            System.out.print("Enter " + (i+1) +" number :");
            number[i] = sc.nextInt();
        }
        int sum = sumOfNumber(number);

        double avg = (double) sum / n;
        System.out.println("Average of given numbers is : " + avg);
    }

    public static void main(String[] args){
        System.out.print("How many numbers you have :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        average_Of_N_Numbers(n);
    }

}
