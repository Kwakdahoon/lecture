package com.webkdh.view뷰;

import java.sql.SQLException;
import java.util.Scanner;

import com.webkdh.controller.service메서드짬통.DuplicateMobileService;
import com.webkdh.dto디티오.FriendDTO;

public class FriendDBInsert {
	
	public static FriendDTO getFriendData() {
		FriendDTO friend = null;
		Scanner sc = new Scanner(System.in);
		String name = "";
		String mobile = "";
		do {
			// 이름은 not null 이어야 하므로 입력 필수
			System.out.println("친구 이름 입력 --->");
			name = sc.nextLine();
		} while (name.equals("")); 
		
		
		boolean result = false;
		
		do {
			System.out.println("친구 전화번호 입력 --->");
			mobile = sc.nextLine(); // 010-1111-2222
			// 유니크조건 때문에 중복체크해야한다.
			try {

				result = DuplicateMobileService.getInstance().duplicateMobileService(mobile);
				System.out.println(result);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		} while (result);
		
		
		
		System.out.println("친구 주소 입력 --->");
		String addr = sc.nextLine();
		
		friend = new FriendDTO(name, mobile, addr);
		System.out.println("aasdsdafasdf"+friend.toString());
		return friend;
	}
	
}
