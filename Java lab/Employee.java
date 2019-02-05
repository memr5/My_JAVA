import java.util.Scanner;
public class Employee {
    public int salary;
    public int work;
    
    public static void getinfo(Employee n,int sal, int hour){
            n.salary = sal;
            n.work = hour;
    }
    public static void AddSal(Employee n){
        if(n.salary <= 500){
            n.salary = n.salary + 10;
        }
    }
    public static void AddWork(Employee n){
        if( n.work >= 6){
            n.salary = n.salary + 5;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee[] employee = new Employee[3]; 
        
        for(int i = 0 ; i<employee.length; i++){
            
            System.out.print("Enter salary of " + (i+1) + " employee");
            int sal =  sc.nextInt();
            System.out.print("Enter workHour of " + (i+1) + " employee");
            int workH = sc.nextInt();
            employee[i] = new Employee();
            getinfo(employee[i],sal,workH);
            AddSal(employee[i]);
            AddWork(employee[i]);
        }
        
        for(int j = 0 ; j < employee.length ; j++ ){
            System.out.print("Employee " + (j+1) + " salary = " + employee[j].salary + " Work Hour = " + employee[j].work + "\n");
        }
    }
    
}