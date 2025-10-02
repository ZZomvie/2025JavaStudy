package study05_extends;

public class ElecCar extends Car {
	public ElecCar(int speed, String name) {
		super(speed, name);
	}

	int battery;

	
	public void charge(int amout) {
		battery += amout;
	}


	@Override
	public String toString() {
		return "ElecCar [battery=" + battery + ", speed=" + speed + ", name=" + name + "]";
	}














	
	

}
