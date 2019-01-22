import java.util.Scanner;

class Sum{
	int n,m,sum;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		Sum c1 = new Sum();
		System.out.print("Enter value of n :");
		c1.n = sc.nextInt();
		System.out.print("Enter value of m :");
		c1.m = sc.nextInt();
		c1.sum = c1.n + c1.m;
		System.out.print("value of sum is :" + c1.sum);		
			
		Sum c2 = new Sum();
		System.out.print("\n\nEnter value of n :");
		c2.n = sc.nextInt();
		System.out.print("Enter value of m :");
		c2.m = sc.nextInt();
		c2.sum = c2.n + c2.m;
		System.out.print("value of sum is :" + c2.sum);		
		
	}

}