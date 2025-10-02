package study06_overrride;

public class Dog extends Animal{
	String breed ; 
	

	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void WagTail() {
		System.out.println(name + "이 꼬리 흔듬");
	}

	@Override
	public void makeSound() {
		System.out.println(name + "가 멍멍 짖습니다");
	}
 
}
