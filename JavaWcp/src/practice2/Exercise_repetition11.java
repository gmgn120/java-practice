package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_repetition11 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		int sum = 0;
		int count = 0;
		for(;;) {
			int value = Integer.parseInt(br.readLine());
			if (value == 0) {
				break;
			}else {
				sum += value;
				count++;

			}
		}
		System.out.println(sum);
		System.out.println(sum/count);
	}
}
