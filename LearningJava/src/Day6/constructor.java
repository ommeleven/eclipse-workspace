package Day6;

public class constructor {
	
	int x,y;
	constructor() {
		x= 100;
		y = 200;
		
		System.out.println(x+y);
		
	}
	
	constructor(int a, char b) {
		x=a;
		y=b;
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		constructor cons = new constructor();
		constructor cons1 = new constructor();
	}

}
