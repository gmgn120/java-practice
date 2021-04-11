package practice2;

public class Exercise_method {
	public static void main(String[] args) {
		System.out.println("3の２乗は"+ pow2(3));
		System.out.println("平均は"+average(3,4));
	}
	static int pow2(int n) {
		return n *n;
	}

	static int average(int n,int m) {
		return (n+m)/2;
	}
}
