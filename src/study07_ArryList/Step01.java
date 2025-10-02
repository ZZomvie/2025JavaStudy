package study07_ArryList;

import java.util.ArrayList;

public class Step01 {
	public static void main(String[] args) {
		ArrayList<String> fuits = new ArrayList<> ();
		
	//	String[] data = new String[5]; //5개의 데이터를 넣는다

		//값 추가
		fuits.add("사과");
		fuits.add("바나나");
		fuits.add("딸기");
		
		
		//출력
		System.out.println(fuits);
		
		//get index
		System.out.println(fuits.get(0)); //특정 인덱스의 요소 가져오기
		
		//count
		System.out.println(fuits.size()); //개수 확인하기
		
		//set() 
		System.out.println(fuits.set(0,"자두")); //0번인덱스출력 -> 0번인덱스 요소를 자두로 변경
		System.out.println(fuits); //바꾼 것을 출력
		
		//remove
		System.out.println(fuits.remove(0)); // 0번인덱스출력 -> 0번인덱스 요소를 제거
		System.out.println(fuits); //바꾼 것을 출력
		
		
		for(int i=0; i<fuits.size();i++) {
			System.out.println(i + "번째 과일은 " + fuits.get(i));
		}
		
		for(String item:fuits ) {
			System.out.println("과일 : " + item);
		}
		
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println(num);
		
		int sum = 0;
		for(Integer number : num) {
			sum += number;
		}
		
		System.out.println("합은 : " + sum);
		
	}

}
