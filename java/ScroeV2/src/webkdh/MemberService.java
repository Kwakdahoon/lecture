package webkdh;

public class MemberService {
	public String login(Member member, String id, String pwd) {
		 if (member.getMemberId().equals(id) && member.getMemberPwd().equals(pwd)) {
	            return "로그인 되었습니다";
	        } else {
	            return "되겠냐?";
	        }
	}


	
//	boolean login (String memberId, String memberPwd) {
//		if (memberId.equals("dooly") && memberPwd.equals("1234")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
}
