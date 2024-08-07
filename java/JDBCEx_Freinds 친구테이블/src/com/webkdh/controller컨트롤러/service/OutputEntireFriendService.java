package com.webkdh.controller컨트롤러.service;
import com.webkdh.controller.service메서드짬통.FriendManagementService;
import com.webkdh.dao다오단.FriendsMgmDAO;
import com.webkdh.dao다오단.FriendsMgmDAOImpl;

public class OutputEntireFriendService implements FriendManagementService {

	@Override
	public void toDo() {
		System.out.println("전체 친구 조회하러 가자");
		FriendsMgmDAO fmd = FriendsMgmDAOImpl.getInstance();
		
		
		
	}

}
