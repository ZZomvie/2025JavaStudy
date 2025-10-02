package study06_RPG;

public class Archer extends GameCharacter {
	// 매개변수
	String bowType;

	// 생성자
	public Archer(String name, int level, int hp, String bowType) {
		super(name, level, hp);
		this.bowType = bowType;
	}

	// 오버라이딩
	@Override
	public void attack() {
		System.out.println(name + "님이 " + bowType + "로 공격하였습니다");
	}

	// 메소드
	public void hide() {
		System.out.println(name + "님이 숨었습니다");
	}

}
