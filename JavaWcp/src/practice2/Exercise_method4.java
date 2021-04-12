package practice2;

public class Exercise_method4 {
	public static void main(String[] args) {
		for (int i =1; i <= 9;i++) {
			Nine(i);
		}
		
	}
	
	static void Nine(int number) {
		for (int i = 1;i <= 9;i++) {
			System.out.printf("%3d",number*i);
		}
		System.out.println();
	}
}
