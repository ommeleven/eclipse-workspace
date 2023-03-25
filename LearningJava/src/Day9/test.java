package Day9;

interface A {
	int a = 10;
	void m1();
}

public class test implements A{
	
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {

		
		A obj = new test();
		test obj1 = new test();
		obj.m1();
		obj1.m1();
	}

}
