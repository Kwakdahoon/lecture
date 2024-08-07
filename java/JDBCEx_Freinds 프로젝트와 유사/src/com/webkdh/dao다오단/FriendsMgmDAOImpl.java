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
	public List<Friend> selectAllFriends() throws ClassNotFoundException, SQLException {
		List<Friend> list = new ArrayList<Friend>();
		
		Connection con = DBConnection.getConnection();
		
		String query = "select * from friends";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			list.add(new Friend(rs.getInt("friendNo"), 
					rs.getString("friendName"), 
					rs.getString("mobile"),
					rs.getString("addr")));
		}
		
		DBConnection.close(rs, pstmt, con);
		return list;
	}

	@Override
	public int checkDuplicateMobile(String mobile) throws ClassNotFoundException, SQLException {
		
		Connection con = DBConnection.getConnection();
		int result = 0;
		
		if (con != null) {
			String query = "select count(*) as 개수 from friends where mobile = ?";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, mobile);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				result = rs.getInt("개수");
//				rs.getInt(1);
			}
			
			
			DBConnection.close(rs, pstmt, con);
			return result;
			
			
		}
		
		return 0;
	}

	@Override
	public int getNextFriendNo() throws ClassNotFoundException, SQLException {
		
		Connection con = DBConnection.getConnection();
		int result = 0;
		
		if (con != null) {
			String query = "select max(friendNo) from friends";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				result = rs.getInt(1) + 1;
			}
			
			DBConnection.close(rs, pstmt, con);
		}
		
		return result;
	}

	@Override
	public int insertFriend(int friendNo, FriendDTO friendDTO) throws SQLException, ClassNotFoundException {
		
		Connection con = DBConnection.getConnection();
		int result = 0;
		
		if (con != null) {
			String query = "insert into friends values (?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, friendNo);
			pstmt.setString(2, friendDTO.getFriendName());
			pstmt.setString(3, friendDTO.getMobile());
			pstmt.setString(4, friendDTO.getAddr());
			
			result = pstmt.executeUpdate();
					
			DBConnection.close(pstmt, con);
			
		}
		return result;
	}

//	@Override
//	public List<Friends> selectFriendByName(SearchNameDTO dto) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
	@Override
	public List<Friend> selectFriendByName(SearchNameDTO dto) throws ClassNotFoundException, SQLException {
		
		Connection con = DBConnection.getConnection();
		List<Friend> list = new ArrayList();
		if (con != null) {
			String query = "select * from friends where friendname = ?";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, dto.getFriendName());
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Friend(rs.getInt("friendNo"), 
						rs.getString("friendName"), 
						rs.getString("mobile"),
						rs.getString("addr")));
			}
			DBConnection.close(rs, pstmt, con);
		}
		return list;
	}


}
