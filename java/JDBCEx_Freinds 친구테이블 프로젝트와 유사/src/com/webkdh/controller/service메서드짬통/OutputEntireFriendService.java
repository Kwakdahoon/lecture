package com.webkdh.controller.service메서드짬통;
import java.sql.SQLException;
import java.util.List;

import com.webkdh.dao다오단.FriendsMgmDAO;
import com.webkdh.dao다오단.FriendsMgmDAOImpl;
import com.webkdh.vo브이오.FriendsVO;

public class OutputEntireFriendService implements FriendManagementService {

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		System.out.println("전체 친구 조회하러 가자");
		FriendsMgmDAO fmd = FriendsMgmDAOImpl.getInstance();
		
		List<FriendsVO> list = fmd.selectAllFriends();
		
		for(FriendsVO f : list) {
			System.out.println(f.toString());
		}
	}

}
