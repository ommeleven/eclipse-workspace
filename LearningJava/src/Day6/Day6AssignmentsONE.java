package Day6;

public class Day6AssignmentsONE {
	
	public static class Student1 {
		
		int SID;
		String Sname;
		int Sub1;
		int Sub2;
		int Sub3;
		int totalMark = Sub1+Sub2+Sub3;
		
	 
	void getStuData(int ID, String name) {
		SID = ID;
		Sname = name;
	}
	void getStuMarks(int S1,int S2,int S3) {
		Sub1 =  S1;
		Sub2 =  S2;
		Sub3 = S3;
	}
	void totalMarks() {
		
		System.out.println(Sub1+Sub2+Sub3);
	}
	}
	public static void main(String[] args) {
		
		Student1 stu1 = new Student1();
		Student1 stu2 = new Student1();
		stu1.getStuData(1001, "om");
		stu2.getStuData(1002, "dange");
		stu1.getStuMarks(100, 90, 98);
		stu2.getStuMarks(19,23,56);
		stu1.totalMarks();
		stu2.totalMarks();
		
		
		
		
			}

}
