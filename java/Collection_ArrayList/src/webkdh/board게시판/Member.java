package webkdh.board게시판;

public class Member {
	private String memberId;
	private String nickName;
	
	public Member(String memberId, String nickName) {
		this.memberId = memberId;
		this.nickName = nickName;
	}

	public void add(String name) {
		// TODO Auto-generated method stub
		
	}

	public String getMemberId() {
		return memberId;
	}

	public String getNickName() {
		return nickName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", nickName=" + nickName + "]";
	}
	
}