package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_repetition7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int strike = 0;
		int ball = 0;
		while (strike < 3 && ball < 4) {
			int judge = Integer.parseInt(br.readLine());
			if (judge==1) {
				strike++;
				System.out.println("ストライク");
			}else if (judge==2) {
				ball++;
				System.out.println("ボール");
			} else {
				System.out.println("ファウル");
				if (strike <= 1) {
					strike++;
				}
			}
		}
		System.out.println(ball+"ボール、"+strike+"ストライク");
	}
}
