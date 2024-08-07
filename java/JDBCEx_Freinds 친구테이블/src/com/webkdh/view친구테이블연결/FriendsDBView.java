package com.webkdh.view친구테이블연결;

import java.util.Scanner;

import com.webkdh.controller.service메서드짬통.FriendManagementService;
import com.webkdh.controller컨트롤러.Action;

public class FriendsDBView {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) { // 싱글톤 확인
//			System.out.println(Action.getInstance()); 
		}
		
		while (true) {
			outputMenu();
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			FriendManagementService fms = Action.getInstance().getService(menu);
			fms.toDo();
		}
		
	}

	private static void outputMenu() {
		System.out.println("*******************************************");
		System.out.println("              친 구 관 리 V1               ");
		System.out.println("*******************************************");
		System.out.println("** 1. 친구 목록 전체 조회                **");
		System.out.println("** 2. 친구 입력                          **");
		System.out.println("** 3. 친구 조회 (이름 조회)              **");
		System.out.println("** 4. 친구 수정 (이름수정)               **");
		System.out.println("** 5. 친구 수정 (전화번호 수정)          **");
		System.out.println("** 6. 친구 수정 (주소수정)               **");
		System.out.println("** 7. 친구 삭제                          **");
		System.out.println("** 9. 종료                               **");
		System.out.println("*******************************************");
		
		System.out.println("메뉴 번호 입력 --->");
	}
}
