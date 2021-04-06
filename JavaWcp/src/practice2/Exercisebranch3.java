package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercisebranch3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		System.out.println("次の中から問診を受けたい曜日を選択し、数値を入力してください");
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int week = Integer.parseInt(br.readLine());
		System.out.println("次の中から問診を受けたい時間帯を選択し、数値を入力してください");
		System.out.println("0=午前、1=午後、2=夜間");
		int time = Integer.parseInt(br.readLine());

		switch (week) {
		case 0:
			System.out.println("休診です");
			break;
		case 1:
		case 4:
			System.out.println("空いています");
			break;
		case 2:
		case 5:
			if (time == 0) {
				System.out.println("休診です");
			} else {
				System.out.println("空いています");
			}
			break;
		case 3:
			if (time == 2) {
				System.out.println("休診です");
			} else {
				System.out.println("空いています");
			}
			break;
		case 6:
			if (time == 0) {
				System.out.println("空いています");
			} else {
				System.out.println("休診です");
			}
		}
	}
}
