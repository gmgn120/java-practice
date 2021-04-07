package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_repetition6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for (int i = 0 ; i < count ; i++) {
			System.out.print("*");
		}
		int count2 = Integer.parseInt(br.readLine());
		for (int i = 0,out = 0;i < count2;i++) {
			System.out.print(out++);
			if (out > 9)
				out = 0;
		}
		int sum = 0;
		while (sum <= 100) {
			sum += Integer.parseInt(br.readLine());
		}
		System.out.println(sum);
	}
}
