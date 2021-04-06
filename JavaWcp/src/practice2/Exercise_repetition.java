package practice2;

public class Exercise_repetition {
	public static void main(String[] args) {
		for (int i = 1;i <= 10;i++) {
			System.out.println("SPAM");
		}
		int x = 3;
		for (int i=1;i<=9;i++) {
			System.out.println(x*i);
		}
		int y = 1;
		for (int i=1;i<=8;i++) {
			y *= 2;
			System.out.println(y);
		}
		int z = 1;
		for (int i = 2;i <= 7;i++) {
			z *=i;
			System.out.println( z );
		}
	}
}
