import java.util.Scanner;

public class Holiday {
    private String name;
    private int day;
    private String month;

    Holiday(String n, int d,String m){
                name = n;
                day = d;
                month = m;
                System.out.println("Constructor is success fully called for " + n );
    }


     public static boolean inSameMonth(Holiday holiday1, Holiday holiday2){
        if(holiday1.month.equals(holiday2.month)){
            return true;
        }else {
            return false;
        }
    }

     public static double avgDate(Holiday[] a){
        int sum = 0;
        for(int i = 0 ; i < a.length ; i++) {
            sum = sum + a[i].day;
        }
        double avg = (double) sum/a.length;
        return  avg;
    }

      public static void main(String[] args){
        //Holiday aa = new Holiday("RepublicDay",15, "january" );
        //Holiday bb = new Holiday("Mahatma Gandhi Jayanti",8, "October" );
        Scanner sc = new Scanner(System.in);
        Holiday[] holiday = new Holiday[2];
        for(int i=0 ; i<2 ;i++){
            System.out.print("Enter Holiday "+ (i+1) +" Name :");
           // holiday[i].name = sc.next();
            String nam = sc.next();
            System.out.print("Enter Date of that day :");
           // holiday[i].day = sc.nextInt();
            int dd = sc.nextInt();

            System.out.print("Enter month of that day :");
           // holiday[i].month = sc.next();
           String mo = sc.next();
            holiday[i] =  new Holiday(nam,dd,mo);
        }
        boolean j = inSameMonth(holiday[0],holiday[1]);
        if(j == true){
            System.out.println("yes!!, both Holiday are in same month");
        }else{
            System.out.println("No!! , both Holiday are not in same month");
        }

        double avg = avgDate(holiday);

        System.out.print("Avg of given holiday dates is : " + avg );
    }

}
