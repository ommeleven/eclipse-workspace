package Day6;

public class methodOverloading {

	int x,y;
	double z;
	
	int addition() {
		x=10;
		y=20;
		return(x+y);
		
	}
	int addition(int a, int b) {
		x=a;
		y=b;
		return(x+y);
		
	}

	double addition(int a, double b) {
		x=a;
		z=b;
		return(x+z);
		
	}
	double addition(int a, int b, double c) {
		x=a;
		y=b;
		z=c;
		return(x+y+z);
	}
	void main() {
		System.out.println("this is main method");
	}
	public static void main(String[] args) {
		
		methodOverloading mo= new methodOverloading();
		System.out.println(mo.addition());
		System.out.println(mo.addition(1,4));
		System.out.println(mo.addition(33,4567.2345));
		System.out.println (mo.addition(12,234,12.34));
		mo.main();

	}

}
