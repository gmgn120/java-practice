package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		// ArrayListを生成する場合
		List<String> list1 = new ArrayList<String>();

		// LinkedListを生成する場合
		List<Integer> list2 = new LinkedList<Integer>();
		list1.add("りんご");
		list1.add("みかん");

		// 位置を指定して要素を追加する
		list1.add(1, "バナナ");
		System.out.println(list1);
		// 要素を取得する
		System.out.println(list1.get(0));
		// 存在チェック (trueを返す)
		System.out.println(list1.contains("バナナ"));
		// 存在チェック (falseを返す)
		System.out.println(list1.contains("なし"));
		//　要素数の取得
		System.out.println(list1.size());
		// 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
		list1.remove("バナナ");
		list1.remove("なし"); // 何もしない

		// 位置を指定して要素を削除する
		list1.remove(0);
		System.out.println(list1);
	}
}
