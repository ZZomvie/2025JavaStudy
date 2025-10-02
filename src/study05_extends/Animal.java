package study05_extends;

public class Animal {
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
//		System.out.println("Animal");
		
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

	public void makeSound() {
		System.out.println(name + "짖습니다");
	}
	
	
	
}
