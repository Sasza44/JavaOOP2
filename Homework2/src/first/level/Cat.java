package first.level;

public class Cat extends Animal {
	private String name;

	public Cat(String ration, String color, int weight) {super(ration, color, weight);}
	public Cat(String ration, String color, int weight, String name) {
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
		return "Cat [name=" + name + ", " + super.toString();
	}
	@Override
	public String getVoice() {
		return "Meow";
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