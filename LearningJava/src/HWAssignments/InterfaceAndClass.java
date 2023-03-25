package HWAssignments;

interface inter {
	int a = 100;
	void display();
}
public class InterfaceAndClass implements inter {
	
	public void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		InterfaceAndClass IC = new InterfaceAndClass();
		IC.display();
	}

}
