package practice;

public class Chapter12_2 {
	public static void main(String[] args) {
		CapsuleMan2 man = new CapsuleMan2("武田", 40);
		System.out.println("名前は"+ man.getName() + "です。");
		System.out.println("年齢は" + man.getAge() + "です。");
		man.setAge(41);
		System.out.println("誕生日を迎えたので" + man.getAge() + "歳になりました。");
	}
}
