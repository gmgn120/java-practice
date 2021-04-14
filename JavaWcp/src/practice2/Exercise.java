package practice2;

public class Exercise {
	public static void main(String[] args) {
		Dog mydog = new Dog("ラブラドール");
		Dog yourdog = new Dog("柴犬");
		mydog.setName("エリー");
		mydog.setAge(3);
		yourdog.setName("ジョン");
		yourdog.setAge(4);
		mydog.ShowProfile();
		yourdog.ShowProfile();
	}
}
