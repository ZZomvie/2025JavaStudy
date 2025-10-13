package study10_IoC_TV1;

public class TVUser {
	public static void main(String[] args) {
//		SamSungTV tv = new SamSungTV();
//		tv.powerOn();
//		tv.powerOff();
//		tv.vollumUp();
//		tv.vollumDown();
//		
		
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
	}
}
