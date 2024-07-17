package webkdh;

public class Member {
	// 멤버 생성
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberAge;
	
	// 생성자
	public Member(String memberId, String memberPwd) {
		this.memberId = memberId;  
		this.memberPwd = memberPwd;  
	}
	// getter
	public String getMemberId() {
		return this.memberId;
	}
	
	public String getMemberPwd () {
		return this.memberPwd;
	}
	
	public String getMemberName () {
		return this.memberName;
	}
	
	public String getMemberAge () {
		return this.memberAge;
	}
	
	public void getLogin() {
		
	}
	
	// 메서드
}
