package study05_extends;

public class Cat extends Animal {
		
	String Skill;
	
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println(name + "가 야옹야옹 짖습니다");
	}
	
	
	public void catSkill() {
		System.out.println(name + "할퀸다");
	}
}
