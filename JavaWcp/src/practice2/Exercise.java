package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		String  s = br.readLine();
		System.out.println("入力した文字は" +  s );

		int x = Integer.parseInt(br.readLine());
		System.out.println("入力した数値は" + x );
		System.out.println(x*x);
		System.out.println(x*x*x);

		int y = Integer.parseInt(br.readLine());
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);

		System.out.println((x+y)/2);

		int age = Integer.parseInt(br.readLine());
		System.out.println(age * 365);
	}
}
