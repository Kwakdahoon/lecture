import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		// 반복적으로 입력받는 경우
		Scanner sc = new Scanner(System.in);
		int tot = 0;
//		
//		while(true) {
//			
//			System.out.println("숫자를 입력하세요 (-1을 입력하면 종료) >>>");
//			int userNum = sc.nextInt(); // 3\n
//			System.out.println(userNum);
//			sc.nextLine(); // \n 제거
//			
//			System.out.println("이름을 입력하세요>>>");
//			String name = sc.next();
//			System.out.println(name);
//			if (userNum == -1) {
//				System.out.println("종료합니다...");
//				break;
//			}
//		}
		
		// 메뉴 선택
		// 1. 도서정보입력 2. 총비용 3. 종료
		// 		1 선택 -> 도서명, 가격, 수량을 입력받아 -> 정보를 출력
		// 		2 선택 -> 총비용(=가격 * 수량) 출력
		// 		3 선택 -> 종료
		
//		Scanner scn = new Scanner(System.in);
//		while (true) {
//			System.out.println("도서 정보를 입력하세요 ('안사'를 입력하면 종료) >>");
//			String bookName = scn.next();
//			System.out.println(bookName);
//			
//			System.out.println("가격을 입력하세요");
//			int price = scn.nextInt();
//			System.out.println(price);
//			
//			System.out.println("몇개나 쳐 사실건가요");
//			int num = scn.nextInt();
//			
//			System.out.println("총 비용" + (price * num) + "입니다.");
//			
//			if (bookName == "안사") {
//				System.out.println("종료데스요..");
//				break;
//			}
//					
//		}
		
		while(true) {
			System.out.print("1. 도서정보입력, 2. 총비용, 3. 종료(메뉴번호 선택) >>>");
			int menu = sc.nextInt(); // 메뉴번호 \n
			
			if (menu == 1) {
				// 도서명, 가격, 수량을 입력받아서 -> 정보를 출력
				sc.nextLine(); // \n
				System.out.print("도서명을 입력하세여 >>>");
				String bookname = sc.nextLine();
				
				System.out.print("가격 입력");
				int bookPrice = sc.nextInt();
				
				System.out.print("수량을 입력하세요");
				int bookQty = sc.nextInt();
				
				System.out.println(bookname +(bookPrice * bookQty));
				
				tot = bookPrice + bookQty;
			} else if (menu == 2) {

				// 비용 출력
				System.out.println("총 가격 : " + (tot));
			} else if (menu == 3) {
				System.out.println("종료합니다...");
				break;
			} else {
				System.out.println("올바르게 쳐 입력해라");
			}
		}

		
	}

}
