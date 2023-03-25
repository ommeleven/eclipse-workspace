
public class Operations {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		// arithmetic operators
		System.out.println("Sum of a and b " +(a+b));
		System.out.println("diff of a and b " +(a-b));
		System.out.println("mul of a and b " +(a*b));
		System.out.println("div of a and b " +(a/b));
		System.out.println("modulo of a and b " +(a%b));
		System.out.println("Sum of a and b " +(a+b));
		
		
		// relational operators or comparison operators
		System.out.println("compare of a and b " +(a<b));

		System.out.println("compare of a and b " +(a<=b));
		System.out.println("compare of a and b " +(a>b));
		System.out.println("compare of a and b " +(a>=b));
		System.out.println("compare of a and b " +(a==b));
		System.out.println("compare of a and b " +(a!=b));
		
		//logical operators

		System.out.println("compare of a and b " +(a<b && b<a));
		System.out.println("compare of a and b " +(a<b || b<a));
		System.out.println("compare of a and b " +(a<b != a>b));
		
		// increment operators
		System.out.println("compare of a and b " +(a++));
		int res = ++a;
		System.out.println("compare of a and b " +(res));
		// decrement operators 
		int resd = --a;
		System.out.println("compare of a and b " +(resd));
		
	}

}
