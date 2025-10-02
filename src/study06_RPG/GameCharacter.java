package study06_RPG;

public class GameCharacter {
	// 멤버 변수
	String name;
	int level;
	int hp;

	
	//생성자
	public GameCharacter(String name, int level, int hp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
	}
	
	//메소드
	public void showInfo() {
		System.out.println("이름 : " + name + ", 레벨 : " + level + ", hp : " + hp );
	}
	
	public void attack() {
		System.out.println(name + "님 공격하였습니다");
	}


}
