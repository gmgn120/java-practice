package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercisebranch {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		if (x > y) {
			System.out.println("xはyより大きい");
		} else if (y > x) {
			System.out.println("yはxより大きい");
		} else {
			System.out.println("xとyは等しい");
		}
		if (x < y) {
			System.out.println(y);
		} else {
			System.out.println(x);
		}
		int z = x + y;
		if (z % 2 == 0) {
			System.out.println(z + "は偶数です");
		} else {
			System.out.println(z + "は奇数です");
		}
		if ((z % 2) == 0) {
			if (z >= 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("負の偶数");
			}
		} else {
			if (z >= 0) {
				System.out.println("正の奇数");
			} else {
				System.out.println("負の奇数");
			}
		}
	}
}
