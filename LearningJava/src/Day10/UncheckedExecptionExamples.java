package Day10;
import java.util.Scanner;

public class UncheckedExecptionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program is started");
		System.out.println("Program is running");
		
		Scanner input = new Scanner(System.in);
		/*System.out.print("Enter some input:  ");
		int num = input.nextInt();
		
		int a= 100;
		try {
		System.out.println(a/num);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception occured");
		}*/
		//NumberFormatException
		/*String s = "erty";
		int n = 0;
		try {
			n = Integer.parseInt(s);
		}
		catch(NumberFormatException e) {

			System.out.println("Exception occured");
		}
		System.out.println(n+100);*/
		String s = null;
		
		System.out.println(s.length());
		
		int a[] = new int[5];
		a[10] = 100;
		
		System.out.println("Program is finished");

	}

}
