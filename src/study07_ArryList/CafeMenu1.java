package study07_ArryList;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeMenu1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Menu> menuList = new ArrayList<>();
		
		
		while(true) {
			System.out.println("===카페메뉴 관리 프로그램===");
			System.out.println("1. 메뉴추가");
			System.out.println("2. 메뉴보기");
			System.out.println("3. 메뉴수정");
			System.out.println("4. 메뉴삭제");
			System.out.println("5. 종료");
			System.out.print("번호를 선택하세요");
			
			int choice = sc.nextInt();
			sc.nextLine(); //가지고 있는 내용 삭제 (버퍼지우기)
			
			switch(choice) {
			case 1 : 
				System.out.print("추가할 메뉴 이름 : ");
				String name = sc.nextLine();
				
				System.out.print("가격 입력 : ");
				int price = sc.nextInt();
				
				sc.nextLine(); //가지고 있는 내용 삭제 (버퍼지우기)
				
				menuList.add(new Menu(name,price)); //메뉴 리스트에 입력받은 배열 추가
				
				System.out.println(name + "메뉴가 추가되었습니다.");
				break;
				
			case 2 : 
				if(menuList.isEmpty()) {
					System.out.println("등록된 메뉴가 없습니다");
				} else {
					System.out.println("카페 메뉴");
					for(int i = 0; i <menuList.size(); i++) {
						System.out.println((i+1) + "." + menuList.get(i));
					}
				}
				
				break;
				
			case 3 : 
				System.out.println("수정할 번호 입력 : ");
				int updateIndex = sc.nextInt() -1 ;
				sc.nextLine();
				
				if(updateIndex >= 0 && updateIndex < menuList.size()) {
					System.out.print("새로운 메뉴 이름 : ");
					String newName = sc.nextLine();
					
					System.out.print("새로운 가격 : ");
					int newPrice = sc.nextInt();
					sc.nextLine();
				
					menuList.get(updateIndex).setName(newName);
					menuList.get(updateIndex).setPrice(newPrice);
					
					
					System.out.println("메뉴가 수정되었습니다");
					}else {
						System.out.println("잘못된 번호입니다");
					}
				
				break;
				
			case 4 : 
				System.out.println("삭제할 메뉴 번호 : ");
				int deleteIndex = sc.nextInt() -1;
				sc.hasNextLine();
				
				
				if(deleteIndex >=0 && deleteIndex < menuList.size()) {
					Menu removed = menuList.remove(deleteIndex);
					System.out.println(removed + "메뉴가 삭제되었습니다");
				}else {
					System.out.println("잘못된 번호입니다");
				}
			
				break;
				
			case 5 : 
				System.out.print("프로그램을 종료합니다");
				return;
				
			default :
				System.out.print("잘못된 입력입니다");
				
			}
		}
		
	}

}
