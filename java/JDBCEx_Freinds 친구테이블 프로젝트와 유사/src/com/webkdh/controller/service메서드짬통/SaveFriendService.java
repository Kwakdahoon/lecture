package com.webkdh.controller.service메서드짬통;

import java.sql.SQLException;

import com.webkdh.dao다오단.FriendsMgmDAO;
import com.webkdh.dao다오단.FriendsMgmDAOImpl;
import com.webkdh.dto디티오.FriendDTO;
import com.webkdh.view뷰.FriendDBInsert;

public class SaveFriendService implements FriendManagementService {

	@Override
	public void toDo() {
		System.out.println("친구 저장");
		
		FriendsMgmDAO dao = FriendsMgmDAOImpl.getInstance();
		// 친구 정보
		FriendDTO friendDTO = FriendDBInsert.getFriendData();
		
		// friendNo 값
		try {
			int friendNo = dao.getNextFriendNo();
			if(dao.insertFriend(friendNo, friendDTO) == 1) {
				System.out.println("친구 저장 완료");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
