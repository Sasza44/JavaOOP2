package first.level;

public class Dog extends Animal {
	private String name;

	public Dog(String ration, String color, int weight) {super(ration, color, weight);}
	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	@Override
	public String getVoice() {
		return "Bow wow";
	}
	@Override
	public void eat() {
		super.eat();
	}
	@Override
	public void sleep() {
		super.sleep();
	}
}