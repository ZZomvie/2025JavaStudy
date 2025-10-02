package study06_RPG;

public class Mage extends GameCharacter {
	//매개변수
	String element;

	// 생성자
	public Mage(String name, int level, int hp, String element) {
		super(name, level, hp);
		this.element = element;
	}
	
	//오버라이딩
	@Override
	public void attack() {
		System.out.println(name + "님이 " + element + "로 공격하였습니다");
	}
	
	//메소드
		public void telerport( ) {
			System.out.println(name + "님이 이동하였습니다");
		}
	

}
