package Day7;

public class callByRef{ 
	int x;

public void addition(callByRef a) {
	x=a.x+5;
	System.out.println(x);
}

public static void main(String[] args) {
	callByRef c= new callByRef();
	c.x = 10;

	System.out.println(c.x);
	c.addition(c);

	System.out.println(c.x);
	
}


}
