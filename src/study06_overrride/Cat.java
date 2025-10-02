package study06_overrride;

public class Cat extends Animal {

	String color;

	public Cat(String name, int age) {
		super(name, age);
	}

	public void scratch() {
		System.out.println(name + "가 할큅니다");
	}

	@Override
	public void makeSound() {
		System.out.println(name + "가 야옹 짖습니다");
	}
}
