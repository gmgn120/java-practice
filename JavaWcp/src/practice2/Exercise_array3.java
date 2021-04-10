package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_array3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int values[] = new int[10];
		int sum = 0;
		
		for (int i = 0;i < 10&&sum <= 100;i++) {
			int num = Integer.parseInt(br.readLine());
			values[i] = num;
			sum += num;
		}
		System.out.println("合計は"+sum);
		for (int n:values) {
			System.out.print(n + " ");
		}
	}
}
