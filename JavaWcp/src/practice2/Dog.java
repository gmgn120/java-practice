package practice2;

public class Dog {
	private String Name;
	private int Age;
	private String Type;
	
	public Dog(String type) {
		Type = type;
	}

	public void setName(String nm) {
		Name = nm;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	public void ShowProfile() {
		System.out.println("私の名前は" + Name + "です");
		System.out.println("年齢は" + Age + "です");
		System.out.println("犬種は" + Type + "です");
	}

}
