package com.webkdh.controller.service메서드짬통;

import java.sql.SQLException;

import com.webkdh.dao다오단.FriendsMgmDAO;
import com.webkdh.dao다오단.FriendsMgmDAOImpl;

public class DuplicateMobileService {

	private static DuplicateMobileService instance = null;
	private DuplicateMobileService() {}
	
	public static DuplicateMobileService getInstance() {
		
		if (instance == null) {
			instance = new DuplicateMobileService();
		}
		return instance;
	}

	public boolean duplicateMobileService(String mobile) throws ClassNotFoundException, SQLException {
		boolean result = false;
		
		FriendsMgmDAO dao = FriendsMgmDAOImpl.getInstance();
		
		if (dao.checkDuplicateMobile(mobile) == 1) {
			result = true;
		}
		
		return false;
	}
	
	

}
