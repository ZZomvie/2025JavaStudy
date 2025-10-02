package study04;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo UserLee = new UserInfo();
		// UserLee.userId = "000011";
		UserLee.userName = "홍길동";

//		System.out.println(UserLee.userId);
		System.out.println(UserLee.userName);
		
		
		UserInfo UserHan = new UserInfo("00011", "한석봉");
		UserInfo UserHan1 = new UserInfo("00012", "한철봉", "test@test.com");
		
		System.out.println(UserHan1.showUserInfo());
		System.out.println(UserHan.getUserId());
		
		
		System.out.println(UserHan1);
	}

}
