package com.webkdh.dao다오단;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.webkdh.vo브이오.FriendsVO;

public interface FriendsMgmDAO {

	List<FriendsVO> selectAllFriends() throws ClassNotFoundException, SQLException;
	
}