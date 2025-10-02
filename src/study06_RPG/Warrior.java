package study06_RPG;

public class Warrior extends GameCharacter {
	//매개변수
	String Wappon;

	// 생성자
	public Warrior(String name, int level, int hp, String Wappon) {
		super(name, level, hp);
		this.Wappon = Wappon;
	}

	//오버라이딩
	@Override
	public void attack() {
		System.out.println(name + "님이 " + Wappon + "로 공격하였습니다");
	}
	
	//메소드
		public void defend( ) {
			System.out.println(name + "님이 방어하였습니다");
		}
	

}
