
class ComplexNumber{
	int real;
	int img;

	ComplexNumber(int a,int b){
		System.out.print("Complex number is ineslise by constructor :\n");
		this.real = a;
		this.img = b;
	}

	static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2){
		ComplexNumber c3 = new ComplexNumber(0,0);
		c3.real = c1.real + c2.real;
		c3.img = c1.img + c2.img;
		return c3;
	}

	static ComplexNumber mul(ComplexNumber c1,ComplexNumber c2){
		ComplexNumber c3 = new ComplexNumber(0,0);
		c3.real = c1.real * c2.real - c1.img * c2.img;
		c3.img = c1.real * c2.img + c1.img * c2.real;
		return c3;	
	}

	static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2){
		ComplexNumber c3 = new ComplexNumber(0,0);
		c3.real = c1.real - c2.real;
		c3.img = c1.img - c3.img;
		return c3;
	}

	public static void main(String[] args){
		ComplexNumber c1 = new ComplexNumber(1,2);
		ComplexNumber c2 = new ComplexNumber(3,4);
		ComplexNumber c3 = sum(c1,c2);
		ComplexNumber c4 = mul(c1,c2);
		ComplexNumber c5 = sub(c1,c2);						
		System.out.println("sum = "+ c3.real+" +i "+c3.img);
		System.out.println("mul = "+ c4.real+" +i "+c4.img);
		System.out.println("sub = "+ c5.real+" +i "+c5.img);
		}
}