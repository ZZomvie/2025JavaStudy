package study10_IoC_TV3;

public class BeanContainer {
	public Object getbean(String id) {

		if (id.equals("lg")) {
			return new LgTV();
		} else if (id.equals("samsung")) {
			return new SamSungTV();
		}

		return null;
	}
}
