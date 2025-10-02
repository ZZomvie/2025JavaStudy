package study06_join;

public class Member {
	// 멤버 변수
	String name;
	int age;

	// 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	public void join() {
		System.out.println(name + "님 회원 가입이 완료 되었습니다"  );
	}

}
