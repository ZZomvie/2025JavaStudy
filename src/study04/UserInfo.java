package study04;

public class UserInfo {
	
	//default 자신의 패키지 안에서만 접근
	//public 전체 접근
	//private 클래스 안에서만 사용
	
	
	private String userId;
	public String userPassward;
	public String userName;
	public String userEmail;
	public String userPhone;
	
	
//	public UserInfo(String string, String string2) {
//		userId = string;
//		userName = string;
//	}
	
	public UserInfo() {	}
	
	
	public UserInfo(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}


	public UserInfo(String userId, String userName, String userEmail) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	
	//게터
	public String getUserId() {
		return userId;
	};
	
	
	//세터
	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String showUserInfo() {
		return "고객 id" + userId + "이고, 등록된 이름은 "  + userName + "입니다";
	}


	//어노테이션 
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userPassward=" + userPassward + ", userName=" + userName
				+ ", userEmail=" + userEmail + ", userPhone=" + userPhone + "]";
	}
	


}
