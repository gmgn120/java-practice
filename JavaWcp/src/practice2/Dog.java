package practice2;

public class Dog {
	private String Name;
	private int Age;

	public void setName(String nm) {
		Name = nm;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void ShowProfile() {
		System.out.println("私の名前は" + Name + "です");
		System.out.println("年齢は" + Age + "です");
	}

}
