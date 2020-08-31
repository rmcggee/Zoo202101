package model;

public class Mouse {
	private String name;
	private int weight;
	private int age;
	
	public Mouse() {
		super();
	}
	public Mouse(String name, int weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String makeNoise() {
		return "Squeek";
	}

}
