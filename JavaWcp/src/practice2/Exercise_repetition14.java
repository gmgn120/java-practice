package practice2;

public class Exercise_repetition14 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3 = n1 + n2;

		while (0 < 1000) {
			System.out.print(n1 + ",");

			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}
