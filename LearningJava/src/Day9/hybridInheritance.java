package Day9;


class A1 {
	void m1() {
		System.out.println("this is from A1");
	}
}
interface B1 {
	void m2();
	
}interface  B2 {
	void m3();
}
public class hybridInheritance extends A1 implements B1,B2{
	public void m2() {
		System.out.println("this is from m2 by B1 ");
	}
	public void m3() {
		System.out.println("this is from M3 by B2 ");
	}
	public static void main(String[] args) {
		
		hybridInheritance HI = new hybridInheritance();
		HI.m1();
		HI.m2();
		HI.m3();
		

	}

}
