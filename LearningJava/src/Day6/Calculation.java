package Day6;

public class Calculation {
	
	int x=100,y=120;
	//case1 : takes no parameters, returns no output
	void sum() {
		System.out.println(x+y);
	}
	//case2: takes no parameters, returns output
	int sum1() {
		return(x+y);
	}
	//case 3: takes parameters, returns no output
	void sum2(int a, int b) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	//case 4: takes parameters, returns output
	int sum3(int a, int b) {
		x=a;
		y=b;
		return(x+y);
	}
	public static void main(String[] args) {
		
		Calculation calc = new Calculation();
		calc.sum();
		
		
		System.out.println( calc.sum1());
		calc.sum2(100, 2345);
		System.out.println(calc.sum3(100, 2345));
		
		
		
		
	}

}
