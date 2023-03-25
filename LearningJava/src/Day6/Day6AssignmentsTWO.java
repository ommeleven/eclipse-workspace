package Day6;

public class Day6AssignmentsTWO {
	
	public static class Calculation {
		int x;
		int y;
		int z;
		
		Calculation(int a, int b, int c) {
			x=a;
			y=b;
			z=c;
		}
		int sum() { 
			return (x+y+z);
		}
		
	} 

	public static void main(String[] args) {

		
		Calculation  cal= new Calculation(1,4,8);
		System.out.println(cal.sum());

	}

}
