package Day7;

public class thisKeyword {

	int a,b;
	
	/*void add(int a, int b) {
		this.a=a;
		this.b=b;
		
	}*/
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	thisKeyword(int a,int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		
		thisKeyword tk = new thisKeyword(10,40);
		//tk.add(10,20);
		tk.display();

	}

}
