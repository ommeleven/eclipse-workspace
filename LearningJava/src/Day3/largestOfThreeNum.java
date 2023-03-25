package Day3;

public class largestOfThreeNum {

	public static void main(String[] args) {
		int a = 1000;
		int b = 200;
		int c = 300;
		
		if(a>b && a>c) {
			System.out.println("A is largest");
		}
		
		else if(b>a && b>c) {
			System.out.println("B is largest");
			
		}
		else
			System.out.println("C is largest");
		

	}

}
