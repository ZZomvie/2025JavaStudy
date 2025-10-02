package study06_RPG;


public class RPGGameTest {

	public static void main(String[] args) {
		GameCharacter user1 = new Warrior("홍길동", 1, 10, "칼");
		GameCharacter user2 = new Mage("박명수", 2, 20, "불");
		GameCharacter user3 = new Archer("김철수", 3, 30, "큰활");

		user1.showInfo();
		user2.showInfo();
		user3.showInfo();

		System.out.println("================");

		user1.attack();
		user2.attack();
		user3.attack();

		System.out.println("================");

		
		// 다운캐스팅
		Warrior w1 = (Warrior) user1;
		w1.defend();
		
		Mage M1 = (Mage) user2;
		M1.telerport();
		
		Archer A1 = (Archer) user3;
		A1.hide();

	}

}
