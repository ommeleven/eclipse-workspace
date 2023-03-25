package HWAssignments;


interface A {
	int a = 10;
	int b = 20;
	
	void sum();
}
interface B {
	int x = 11;
	int y = 22;
	
	void multiply();
}

public class MultipleInheritance implements A,B{
	
	public void sum() {
		System.out.println(a+b);
	}
	public void multiply() {
		System.out.println(x*y);
	}
	

	public static void main(String[] args) {
		
		MultipleInheritance io = new MultipleInheritance();
		io.multiply();
		io.sum();

	}

}
