package com.webkdh.dao다오단;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.webkdh.vo브이오.FriendsVO;

public class FriendsMgmDAOImpl implements FriendsMgmDAO{
	
	private static FriendsMgmDAOImpl instance = null;
	
	private FriendsMgmDAOImpl() { }
	
	public static FriendsMgmDAOImpl getInstance() {
		if (instance == null) {
			instance = new FriendsMgmDAOImpl();
		}
		return instance;
	}

	@Override
	public List<FriendsVO> selectAllFriends() throws ClassNotFoundException, SQLException {
		List<FriendsVO> list = new ArrayList<FriendsVO>();
		
		Connection con = DBConnection.getConnection();
		
		String query = "select * from friends";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			new FriendsVO(rs.getInt("friendNo"), 
					rs.getString("friendName "), 
					rs.getString("mobile"),
					rs.getString("addr"));
		}
		
		return list;
	}

}
