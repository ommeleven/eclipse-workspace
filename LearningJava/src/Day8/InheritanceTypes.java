package Day8;

class A {
	int a;
	
	void display() {
		System.out.println(a);
	}
}
class B extends A { //B is child class of A
	int b;
	
	void print() {
		
		System.out.println(b);
	}
}
class C extends B { //B is child class of A
	int c;
	
	void show() {
		
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		A aobj = new A();
		aobj.a =100;
		aobj.display();
		
		B bobj = new B();
		bobj.a = 123; 
		bobj.b =10023456;
		bobj.print();

		bobj.display();
		C cobj = new C();
		cobj.a = 1231234; 
		cobj.b =10023;
		cobj.c = 18765;
		cobj.print();
		cobj.display();		
	}

}
