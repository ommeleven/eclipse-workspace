package Day5;

public class Strings {

	public static void main(String[] args) {
		
		String w = "om Dange";
		String w1 = "devidas ";
		System.out.println(w.length());
		System.out.println(w+"  "+w1);
		System.out.println(w.concat(w1));
		System.out.println(w.trim());
		
		System.out.println("om".concat(" dange"));
		System.out.println(w.charAt(3));
		System.out.println(w.contains("Dang"));
		System.out.println(w.equals("om Dange"));
		
		
		System.out.println(w.equalsIgnoreCase("om dange"));
		
		System.out.println(w.replace("om","devidas"));
		
		System.out.println(w.substring(0, 6));
		System.out.println("QWEFfdgbhERJH".toUpperCase());
		
		
		
		
		
	}

}
