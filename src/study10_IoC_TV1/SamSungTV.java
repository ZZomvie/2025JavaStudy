package study10_IoC_TV1;

public class SamSungTV {
	public SamSungTV() {
	 System.out.println("===> SamsungTV 생성");
	};
	
	public void powerOn() {
		 System.out.println("SamsungTV ---전원을 켠다");
	}
	
	public void powerOff() {
		 System.out.println("SamsungTV ---전원을 끈다");
	}
	
	public void vollumUp() {
		 System.out.println("SamsungTV ---소리 올린다");
	}
	
	public void vollumDown() {
		 System.out.println("SamsungTV ---소리 내린다");
	}

}
