package study05_extends;

public class GasolinCar extends Car {
	public GasolinCar(int speed, String name) {
		super(speed, name);

	}

	int gasolin;

	public void gasolin(int amout) {
		gasolin += amout;
	}

	@Override
	public String toString() {
		return "GasolinCar [speed=" + speed + ", name=" + name + ",  gasolin=" + gasolin + "]";
	}

}
