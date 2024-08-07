package com.webkdh.dao다오단;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.webkdh.dto디티오.FriendDTO;
import com.webkdh.dto디티오.SearchNameDTO;
import com.webkdh.vo.Friend;

public interface FriendsMgmDAO {

	List<Friend> selectAllFriends() throws ClassNotFoundException, SQLException;

	int checkDuplicateMobile(String mobile) throws ClassNotFoundException, SQLException;

	int getNextFriendNo() throws ClassNotFoundException, SQLException;

	int insertFriend(int friendNo, FriendDTO friendDTO) throws SQLException, ClassNotFoundException;

	List<Friend> selectFriendByName(SearchNameDTO dto) throws ClassNotFoundException, SQLException;

//	void selectFriendByName(SearchNameDTO dto) throws ClassNotFoundException, SQLException;
	


	
}