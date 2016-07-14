package chapter02;

public class Person {
	int age;
	private String name;
	public int height;
	protected double weight;

	public Person() {
		System.out.println("Person() called...");
	}

	public Person(int i) {
		System.out.println("Person(int i) called...");
	}

	public void showInfo() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
	}
}
