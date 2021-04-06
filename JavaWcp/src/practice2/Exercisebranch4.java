package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercisebranch4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		System.out.println("次の中から祝日を知りたい月を選択して数値を入力してください");
		System.out.println("1=1月、2=2月、3=3月、4=4月、5=5月、6=6月、7=7月、8=8月、9=9月、10=10月、11=11月、12=12月");
		int month = Integer.parseInt(br.readLine());

		switch(month) {
		case 1:
			System.out.println("１月：元日、成人の日");
			break;
		case 2:
			System.out.println("２月：建国記念の日");
			break;
		case 3:
			System.out.println("３月：春分の日");
			break;
		case 4:
			System.out.println("４月：昭和の日");
			break;
		case 5:
			System.out.println("５月：憲法記念日、みどりの日、こどもの日");
			break;
		case 6:
		case 8:
			System.out.println("祝日はありません");
			break;
		case 7:
			System.out.println("７月：海の日");
			break;
		case 9:
			System.out.println("９月：敬老の日、秋分の日");
			break;
		case 10:
			System.out.println("１０月：体育の日");
			break;
		case 11:
			System.out.println("１１月：文化の日、勤労感謝の日");
			break;
		case 12:
			System.out.println("１２月：天皇誕生日");
			break;
		}
		System.out.println("次の中から月の日数を知りたい月を選択して数値を入力してください");
		System.out.println("1=1月、2=2月、3=3月、4=4月、5=5月、6=6月、7=7月、8=8月、9=9月、10=10月、11=11月、12=12月");
		int day = Integer.parseInt(br.readLine());

		switch(day) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31日");
			break;
		case 2:
			System.out.println("28日");
		    break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30日");
			break;
		default:
			System.out.println("入力が間違っています");
		}
	}
}
