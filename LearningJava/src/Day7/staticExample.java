package Day7;

public class staticExample {
	
	static int a=10;
	 int b = 20; 
	static void m1() {
		System.out.println("static method");
	}
	  void m2() {
		System.out.println("non static method");
	}
	 void m3() {
			System.out.println(a);
			m1();

			System.out.println(b);
			m2();
	 }


}
