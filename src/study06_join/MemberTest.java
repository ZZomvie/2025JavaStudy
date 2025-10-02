package study06_join;

public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new StudentMember("홍길동" , 15, "서울중학교");
		Member m2 = new TeacherMember("이순신" , 28, "과학");
		
		m1.join();
		m1.showInfo();
		
		m2.join();
		m2.showInfo();
		
		System.out.println("=====================");
		
		
		//다운캐스팅
		StudentMember s1 = (StudentMember)m1;
		s1.study();
		
		TeacherMember t1 = (TeacherMember)m2;
		t1.theach();
		
		
	}
	


}
