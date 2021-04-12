package practice2;

public class Exercise_method2 {
	public static void main(String[] args) {
		DrawTriangle(3);
		System.out.println();
		DrawTriangle(4);
		System.out.println();
		DrawTriangle(5);
		System.out.println();
	}
	static void DrawTriangle(int size) {
		for (int i = 0;i < size;i++) {
			for (int j = 0;j <= i;j++) {
				System.out.print( "$" );
			}
			System.out.println();
		}
	}
}
