package study10_IoC_TV1;

public class LgTV {
	public LgTV() {
	 System.out.println("===> SamsungTV 생성");
	};
	
	public void turnOn() {
		 System.out.println("SamsungTV ---전원을 켠다");
	}
	
	public void turnOff() {
		 System.out.println("SamsungTV ---전원을 끈다");
	}
	
	public void soundUp() {
		 System.out.println("SamsungTV ---소리 올린다");
	}
	
	public void soundDown() {
		 System.out.println("SamsungTV ---소리 내린다");
	}

}
