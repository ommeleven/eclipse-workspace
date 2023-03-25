package Day8;


class Bank {
	double rateOfInterest() {
		return 0;
	}
}
class AXIS extends Bank {
	double rateOfInterest() {
		return 10.5;
	}
}
class ICICI extends Bank{
	double rateOfInterest() {
		return 7.5;
	}
}
public class methodoverridding {

	public static void main(String[] args) {
		AXIS axisobj = new AXIS();
		ICICI iciciobj = new ICICI();
		System.out.println(axisobj.rateOfInterest());
		System.out.println(iciciobj.rateOfInterest());
		

	}

}
