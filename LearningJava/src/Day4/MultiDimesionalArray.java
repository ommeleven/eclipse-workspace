package Day4;

public class MultiDimesionalArray {

	public static void main(String[] args) {
		
		/*int a[][] = new int[3][2];
		int []b[] = new int[4][3];
		a[0][0] = 100;
		a[0][1] = 200;*/
		
		
		
		
		int a[][] = {{100,200},{200,300},{300,400}};
		int c = a.length;
		System.out.println(c);
		System.out.println(a[2].length);
		
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
				
			}
		System.out.println();
		}
		for(int r[]:a) {
			for(int i:r) {

				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}

}
