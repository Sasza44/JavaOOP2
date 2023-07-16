package first.level;

public class Animal {
	private String ration;
	private String color;
	private int weight;
	
	public Animal() {}
	public Animal(String ration, String color, int weight) {
		this.ration = ration;
		this.color = color;
		this.weight = weight;
	}
	public String getRation() {
		return ration;
	}
	public void setRation(String ration) {
		this.ration = ration;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Animal [ration=" + ration + ", color=" + color + ", weight=" + weight + "]";
	}
	
	public String getVoice() {
		return "bebebe";
	}
	public void eat() {
		System.out.println("I'm eating");
	}
	public void sleep() {
		System.out.println("I'm sleeping");
	}
}
