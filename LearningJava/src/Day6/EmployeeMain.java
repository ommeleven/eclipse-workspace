package Day6;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		// refernce variable
		emp1.eID = 100;
		emp1.eName = "David";
		emp1.deptNo = 1;
		emp1.Job = "Executive";
		
		Employee emp2 = new Employee();
		emp2.eID = 101;
		emp2.eName = "Ryan";
		emp2.deptNo = 2;
		emp2.Job = "Engineer";
		
		emp1.display();
		emp2.display();
	}
}