package first.level;

public class First {
	public static void main(String[] args) {
		Cat cat = new Cat("milk", "white", 3, "Mary");
		System.out.println(cat.getVoice());
		System.out.println("Hello, my name's " + cat.getName());
		cat.eat();
	}
}