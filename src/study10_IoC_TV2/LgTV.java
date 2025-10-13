package study10_IoC_TV2;

public class LgTV implements TV {
	public LgTV() {
	 System.out.println("===> LGTV 생성");
	};
	
	public void powerOn() {
		 System.out.println("LGTV ---전원을 켠다");
	}
	
	public void powerOff() {
		 System.out.println("LGTV ---전원을 끈다");
	}
	
	public void vollumUp() {
		 System.out.println("LGTV ---소리 올린다");
	}
	
	public void vollumDown() {
		 System.out.println("LGTV ---소리 내린다");
	}

}
