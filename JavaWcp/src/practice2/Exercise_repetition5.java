package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_repetition5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int min = 0;
		for (int i = 0;i < 10;i++) {
			int value = Integer.parseInt(br.readLine());
			if ( i == 0) {
				max = value;
				min = value;	
			} else if (value > max) {
				max = value;
			} else if (value < min) {
				min = value;
			}
		}
		System.out.println("最大値は"+ max);
		System.out.println("最小値は"+ min);
	}
}
