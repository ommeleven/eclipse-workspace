package Day5;

public class stringPresenceinArray {
	public static void main(String[] args) {
		String s[]= {"om","dange","asmi","devidas","jyoti"};
		
		String v = "jyoti";
		
		for(String i:s) {
			if(i.equals(v)) {
				System.out.println("String found"+ i);break;
			}
			else {

				System.out.println("String NOT found");
			}
				
				
		}
	
	
	
	}

}
