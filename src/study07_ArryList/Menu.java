package study07_ArryList;

public class Menu {
	//매개변수
	String name;
	int price;

	
	//생성자
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//오버라이딩
	@Override
	public String toString() {
		return  name + " 는 " + price + "원";
	}
	
	
	//메소드
	public void setName(String name) {
		this.name = name;
		
	}

	public void setPrice(int price) {
		this.price = price;		
	}
	

	

}
