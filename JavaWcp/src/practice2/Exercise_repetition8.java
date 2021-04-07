package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_repetition8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.parseInt(br.readLine());
		for (int n=2;n<sum;n++) {
			if (sum % n==0) {
				System.out.println(sum + "は素数ではありません");
				return;
			}
		}
		System.out.println(sum + "は素数です");
	}
}
