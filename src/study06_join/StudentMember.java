package study06_join;

public class StudentMember extends Member{
	//멤버변수
	String school;

	//생성자
	public StudentMember(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	

	//오버라이딩
	@Override
	public void join() {
		System.out.println("학생회원" + name + "님, 학교( " + school + " )정보와 함께 가입되었습니다" );
	}
	
	//메소드
	public void study( ) {
		System.out.println(name + "님이 공부를 시작합니다");
	}
	
	
}
