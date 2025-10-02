package study05_extends;

public class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);  // 부모 생성자 호출
    }

    @Override
    public void makeSound() {
        System.out.println(name + "가 어흥 짖습니다");
    }
}
