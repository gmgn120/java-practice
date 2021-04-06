package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercosebranch2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		int score = Integer.parseInt(br.readLine());
		
		if (score >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		if (score >= 80) {
			System.out.println("たいへんよくできました");
		}else if (score >= 60){
			System.out.println("よくできました");
		} else {
			System.out.println("残念でした");
		}
		
		if (score >= 80) {
			System.out.println("優");
		} else if (score >= 70 ) {
			System.out.println("良");
		} else if (score >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
		int score2 = Integer.parseInt(br.readLine());
		int totalscore = score + score2;
		
		if (score >= 60 && score2 >= 60) {
			System.out.println("合格");
		} else if (totalscore >= 130) {
			System.out.println("合格");
		} else if ((totalscore >= 100) && (score >= 90 || score2 >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		} 
	}
}
