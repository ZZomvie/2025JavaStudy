package study05_extends;

public class HeroTest {

	public static void main(String[] args) {
		Ironman ironLee = new Ironman("이순신", "슈트", 89, 90);
		hulk hulkHong = new hulk("홍길동", "펀치", 100, 910);

		ironLee.showHeroInfo();
		hulkHong.showHeroInfo();
	}

}
