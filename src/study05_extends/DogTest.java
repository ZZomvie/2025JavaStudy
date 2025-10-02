package study05_extends;

public class DogTest {

	public static void main(String[] args) {
		Dog myfat = new Dog("퍼피", 5);
		Cat myCat = new Cat("나비", 6);
		
		Animal myfat1 = new Dog("코코",3);
		Animal myCat1 = new Cat("타코",4);
		Animal tigerMan = new Animal("티커",6);
		
		myfat.foot = 4;
		myCat.Skill = "냥";
		
		myfat.dogSkill();
		

//		myfat.name = "퍼피";
//		System.out.println(myfat.name);
		myfat.showInfo();
		myfat.makeSound();

		myCat.showInfo();
		myCat.makeSound();

		System.out.println(myCat.toString());
		System.out.println(myfat.toString());
		
		
		tigerMan.makeSound();
		
		
		
		
		
	}

}
