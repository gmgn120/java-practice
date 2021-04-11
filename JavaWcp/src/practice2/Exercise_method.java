package practice2;

public class Exercise_method {
	public static void main(String[] args) {
		int z = 8;
		System.out.println("3の２乗は"+ pow2(3));
		System.out.println("平均は"+average(3,4));
		System.out.println("最も大きいのは"+ large(z,large(5,6)));
	}
	static int pow2(int n) {
		return n *n;
	}

	static int average(int n,int m) {
		return (n+m)/2;
	}
	
	static int large(int x, int y) {
		if ( x < y) {
			return y;
		}else {
			return x;
		}
	}
}
