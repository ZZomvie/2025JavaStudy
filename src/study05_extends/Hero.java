package study05_extends;

public class Hero {
	// 멤버변수
	String name;
	String power;
	int attack;
	int defence;
	String rank;

	//구조체
	public Hero(String name, String power, int attack, int defence) {
		this.name = name;
		this.power = power;
		this.attack = attack;
		this.defence = defence;
		this.rank = calculateRank();

	}

	//랭크
	public String calculateRank() {
		int score = attack + defence;
		if (score >= 180) {
			return "s";
		} else if (score >= 140) {
			return "a";
		} else if (score >= 100) {
			return "b";
		} else {
			return "c";
		}
	}

	//메소드
	public void showHeroInfo() {
		System.out.println("==============================");
		System.out.println("히어로 이름" + name);
		System.out.println("능력" + power);
		System.out.println("공격력" + attack);
		System.out.println("방어력" + defence);
		System.out.println("등급" + rank);
		System.out.println("==============================");
	}

}
