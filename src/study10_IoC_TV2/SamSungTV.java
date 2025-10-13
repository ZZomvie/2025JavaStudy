package study10_IoC_TV2;

public class SamSungTV implements TV {
	public SamSungTV() {
	 System.out.println("===> SamsungTV 생성");
	};
	
	@Override
	public void powerOn() {
		 System.out.println("SamsungTV ---전원을 켠다");
	}
	
	@Override
	public void powerOff() {
		 System.out.println("SamsungTV ---전원을 끈다");
	}
	
	@Override
	public void vollumUp() {
		 System.out.println("SamsungTV ---소리 올린다");
	}
	
	@Override
	public void vollumDown() {
		 System.out.println("SamsungTV ---소리 내린다");
	}

}
