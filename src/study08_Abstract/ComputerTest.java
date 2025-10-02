package study08_Abstract;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer mycom = new Desktop();
		
		//부모는 메소드 이름만 선언, 자식은 메소드를 구현
//		mycom.display();
		
		Computer mycom = new Desktop();
		Desktop mycom1 = new Desktop();
		
		Desktop han = new Desktop();
		
		Desktop mycom2 = (Desktop)mycom;
	
	}

}
