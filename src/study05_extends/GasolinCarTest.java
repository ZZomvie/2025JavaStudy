package study05_extends;

public class GasolinCarTest {

	public static void main(String[] args) {
		GasolinCar gas = new GasolinCar(10, "다람쥐");
		
		System.out.println(gas);
		
		gas.setSpeed(140);
		System.out.println(gas.toString());
		
		gas.gasolin(100);
		System.out.println(gas.toString());
		
		gas.name = "고양이";
		System.out.println(gas.toString());

	}

}
