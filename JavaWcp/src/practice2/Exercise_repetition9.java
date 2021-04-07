package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_repetition9 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = 2;num > 1;i++) {
			while( num % i == 0 ) {
				System.out.print(i + " ");
				num /= i;
			}
		}
	}
}
