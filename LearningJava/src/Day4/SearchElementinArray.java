package Day4;

public class SearchElementinArray {

	public static void main(String[] args) {
		int a[] = {100,200,300,400,500};
		
		boolean flag=false; 
		int num=500;
		for(int i:a) {
			if(i==num) {
				flag = true;
				System.out.println(i);
				break;
			}if(flag==false) {

				System.out.println("element not found");
				
			}
		}
	}

}
