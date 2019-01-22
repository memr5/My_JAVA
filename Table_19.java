import java.util.Scanner;

class Table_19{

	

		int t;	
	


	
	public static void main(String[] args){
		Table_19 c1 = new Table_19();
		Scanner sc = new Scanner(System.in);
		c1.t =  sc.nextInt();
		
			
		for(int i = 1; i<= 10 ;i++ ){
				System.out.println( c1.t +" * " + i + " = " + i*c1.t );
		}
		
		int n=1;
		System.out.println("\nwhile\n");	
		
		while(n<11){
			System.out.println( c1.t +" * " + n + " = " + n*c1.t );
			n++;
		}
		
		int w=1;
			System.out.println("\ndo while\n");
		do{
		
			System.out.println( c1.t +" * " + w + " = " + w*c1.t );
			w++;
		}while(w <= 10);
	}
}