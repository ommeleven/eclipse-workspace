package Day6;

public class Student {

	int sID;
	String sName;
	char grade;
	
	/*void getValues(int ID, String name, char g) {
		sID = ID;
		sName = name;
		grade = g;
		
		
	}*/
	Student(int ID, String name, char g)  {
		sID = ID;
		sName = name;
		grade = g;
	}
	void Display() {
		System.out.println(sID);
		System.out.println(sName);
		System.out.println(grade);
		
	}
	
	
}
