package study05_extends;

public class Dog extends Animal{
	
	int foot;
	 
	//구조체
	public Dog (String name, int age) {
		super(name,age);
//		System.out.println("Dog");
	}
	
//	public void makeSound() {
//		System.out.println(name + "가 멍멍 짖습니다");
//	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + "가 멍멍 짖습니다");
	}
	
	
	public void dogSkill() {
		System.out.println(name + "달린다");
	}
}
