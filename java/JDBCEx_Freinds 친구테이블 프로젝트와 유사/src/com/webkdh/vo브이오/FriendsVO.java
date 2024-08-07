package com.webkdh.vo브이오;

public class FriendsVO {
//	friendNo(PK), 숫자(4)
//	friendName 문자열(15), nullable = N
//	mobile  문자열(13) 유일
//	addr    문자열(50)
	private int friendNo;
	private String friendName;
	private String mobile;
	private String addr;
	
	public FriendsVO(int friendNo, String friendName, String mobile, String addr) {
		super();
		this.friendNo = friendNo;
		this.friendName = friendName;
		this.mobile = mobile;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "FriendsVO [friendNo=" + friendNo + ", friendName=" + friendName + ", mobile=" + mobile + ", addr="
				+ addr + "]";
	}
	
	
	
	
}
