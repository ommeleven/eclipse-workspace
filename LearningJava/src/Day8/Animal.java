package Day8;

public class Animal {

	String color = "White";
	void eating() {
		System.out.println(color);
		
	}
}

class Dog extends Animal {
	String color = "brown";
	void eating() {
		System.out.println("i have a dog");
		super.eating();
	}
	void display() {
		
		System.out.println(super.color);
		System.out.println("overridding variable   "+color);
	}
	}
