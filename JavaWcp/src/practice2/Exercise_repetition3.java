package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_repetition3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int win = 0;
		int lose = 0;
		for (int i = 0; i < 10;i++) {
			int score = Integer.parseInt(br.readLine());
			if (score == 0) {
				lose += 1;
			} else if (score == 1) {
				win += 1;
			} else {
				System.out.println("入力間違っています");
			}
		}
		System.out.println("勝ちは" + win+ "回、負けは" + lose + "回です。" );
	}
}
