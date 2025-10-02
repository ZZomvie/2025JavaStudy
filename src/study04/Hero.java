package study04;

import java.util.Arrays;

public class Hero {
	// 멤버변수
	String name;
	String power;
	int attack;
	int defence;
	String rank;
	String[] skills ;

	public Hero(String name, String power, int attack, int defence) {
		this.name = name;
		this.power = power;
		this.attack = attack;
		this.defence = defence;
		this.rank = calculateRank();
		this.skills = new String[0] ; //기술 없음
	}
	
	public Hero(String name, String power, int attack, int defence,String[] skills) {
		this.name = name;
		this.power = power;
		this.attack = attack;
		this.defence = defence;
		this.rank = calculateRank();
		this.skills = skills ; //기술 있음
	}

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

	public void showHeroInfo() {
		System.out.println("==============================");
		System.out.println("히어로 이름" + name);
		System.out.println("능력" + power);
		System.out.println("공격력" + attack);
		System.out.println("방어력" + defence);
		System.out.println("등급" + rank);
		
		if(skills.length > 0) {
			System.out.println("보유기술" + Arrays.toString(skills));
		}else {
			System.out.println("보유기술 없음");
		}
		System.out.println("==============================");
	}

}
