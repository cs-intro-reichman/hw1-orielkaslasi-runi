// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		int c = (int)(Math.random() * 100);
		System.out.println(a+ " " + b + " " + c);
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int middle = ( (a+b+c) - max - min);
		System.out.println(min + " " + middle + " " + max);
	}
}
