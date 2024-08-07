package com.webkdh.controller컨트롤러;

import com.webkdh.controller.service메서드짬통.FriendManagementService;
import com.webkdh.controller컨트롤러.service.OutputEntireFriendService;
import com.webkdh.controller컨트롤러.service.SaveFriendService;

public class Action{
	private Action() {} // 기본생성자 private로 해줘야 싱글톤이 됨
	
	// 싱글톤
	private static Action instance = null;
	
	public static Action getInstance() {
		if (instance == null) {
			instance = new Action();
		}
		return instance;
	}
	
	
	public FriendManagementService getService(int menu) {
		
		FriendManagementService result = null;
		
		switch (menu) {
		case 1:
			result = new OutputEntireFriendService();
			break;
		case 2:
			result = new SaveFriendService();
			break;
		case 9:
			System.exit(0);
			break;
		default:
			break;
		}
		return result;
	}
}
