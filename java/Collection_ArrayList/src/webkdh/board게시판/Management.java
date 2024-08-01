package webkdh.board게시판;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Management { // 회원 관리 클래스
	private Map<String, Member> manage = new HashMap<>();
	
	public Map<String, Member> getManage() {
		return manage;
	}

	public void insert(Member member) {
		manage.put(member.getMemberId(), member);
	}
	public Member selectByUserId(String userId) {
		return manage.get(userId);
	}
	
	public Member selectByNickname(String name) {
		for (Member member : manage.values()) {
			if (member.getNickName().equals(name)) {
				return member;
			}
		}
		return null;
	}
	
	// 회원검색
	public void deleteMember(String userId) {
		manage.remove(userId);
	}

	
}
