package study10_IoC_TV2;

public class TVUser {
	public static void main(String[] args) {
		
	TV tv = new SamSungTV();
		tv.powerOn();
		tv.powerOff();
		tv.vollumUp();
		tv.vollumDown();
	}
}
