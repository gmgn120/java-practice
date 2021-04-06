package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise_repetition4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int giants = 0;
		int tigers = 0;

		for (int i = 1; i <= 9; i++) {
			int gscore = Integer.parseInt(br.readLine());
			giants += gscore;
			System.out.println(i + "回表、巨人の得点は？" + gscore);
			int tscore = Integer.parseInt(br.readLine());
			tigers += tscore;
			System.out.println(i + "回裏、阪神の得点は？" + tscore);
		}
		System.out.println("巨人：" + giants + "点,阪神：" + tigers + "点");
		if (giants < tigers) {
			System.out.println("阪神の勝ち");
		} else if (giants > tigers) {
			System.out.println("巨人の勝ち");
		} else {
			System.out.println("同点");
		}
	}
}
