// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]); // chosen number
		int hundreds, tens, ones;
		hundreds = num / 100;
		tens = (num / 10) % 10;
		ones = (num % 100) % 10;
		System.out.println(+hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
