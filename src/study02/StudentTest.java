package study02;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student();
		lee.studentName = "이순신";
		lee.adress = "서울";

		Student han = new Student();
		han.studentName = "한석봉";
		han.adress = "부산";

//		System.out.println(lee.studentName);

		lee.showInfo();
		han.showInfo();
		

		System.out.println(lee);
		System.out.println(han);
	}

}
