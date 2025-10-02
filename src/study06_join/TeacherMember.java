package study06_join;

public class TeacherMember extends Member {
	//멤버변수
		String Subject;
	
	//생성자
	public TeacherMember(String name, int age, String Subject) {
		super(name, age);
		this.Subject = Subject;
		
	}
	
	//오버라이딩
	@Override
	public void join() {
		System.out.println("교사회원" + name + "님, 과목( " + Subject + " )정보와 함께 가입되었습니다" );
	}
	
	//메소드
		public void theach( ) {
			System.out.println(name + "님이 수업을 시작합니다");
		}
	
	

}
