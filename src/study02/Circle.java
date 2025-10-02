package study02;

public class Circle {

	// 멤버변수
	int radius;
	String color;

	public void getArea() {
		System.out.println("원의 둘레는" + (3.14 * radius * radius));

	}

	public double getArea1() {
		return 3.14 * radius * radius;
	}

}
