package Day9;

interface ABC  {
	int x=100;
	void m1();
}
interface XYZ  {
	int y=200;
	void m2();
}
public class miltipleInheritance implements ABC,XYZ {

	public void m1() {
		System.out.println("method m1 " + (x+100));
	}
	public void m2() {
		System.out.println("method m2  "+ (y+100));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miltipleInheritance z = new miltipleInheritance();
		z.m1();
		z.m2();

	}

}
