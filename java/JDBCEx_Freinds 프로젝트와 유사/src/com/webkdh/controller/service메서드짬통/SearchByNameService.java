package com.webkdh.controller.service메서드짬통;

import java.sql.SQLException;
import java.util.List;

import com.webkdh.dao다오단.FriendsMgmDAO;
import com.webkdh.dao다오단.FriendsMgmDAOImpl;
import com.webkdh.dto디티오.SearchNameDTO;
import com.webkdh.view뷰.FriendDBInsert;
import com.webkdh.vo.Friend;

public class SearchByNameService implements FriendManagementService {

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		FriendsMgmDAO dao = FriendsMgmDAOImpl.getInstance();
		
		SearchNameDTO dto = FriendDBInsert.getSearchByNameData();
		List<Friend> list = dao.selectFriendByName(dto);
		
		for (Friend f : list) {
			System.out.println(f.toString());
		}
		
		dao.selectFriendByName(dto);
	}

}
