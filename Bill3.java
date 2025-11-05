// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
	    String name2 = args[1];
	    String name3 = args[2];
		int price = Integer.parseInt(args[3]);
		double finalPrice = (price / 3.0);
		finalPrice = Math.ceil(finalPrice);
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + 
						name1 + ": pay " + finalPrice + " Shekels each.");
	}
}
