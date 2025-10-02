package study02;

public class DeskLamp {
	private boolean isOn;
	String color;
	
//	public DeskLamp() {} //디폴트 생성자

	public void turnOn() {
		isOn = true;
	}

	public void turnOff() {
		isOn = false;
	}

	public String toString() {
		return "현상태는 " + ((isOn == true) ? "켜짐" : "꺼짐");
	}

}
