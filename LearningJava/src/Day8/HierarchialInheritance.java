package Day8;

class Parent {
	//int a;
	void display(int a) {
		System.out.println(a);
	}
}
class Child1 extends Parent{
	//int x;
	void out(int x) {
		System.out.println(x);
	}
}
class Child2 extends Parent{
	//int y;
	void show(int y) {
		System.out.println(y);
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		Child1 ch1 = new Child1();
		//ch1.a = 100;
		//ch1.x = 200;
		Child2 ch2 = new Child2();
		//ch2.a = 100;ch2.y = 300;
		ch1.display(100);
		ch1.out(200);
		
		ch2.display(1002);
		ch2.show(213);
		
		
		

	}

}
