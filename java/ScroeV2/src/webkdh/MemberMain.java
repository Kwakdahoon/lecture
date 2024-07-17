
package webkdh;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
//	Member loginInfo = new Member("dooly", "1234"); // 로그인 입력정보
//	// 객체생성
//	MemberService ms = new MemberService();
//	boolean result = ms.login(loginInfo.getMemberAge(), loginInfo.getMemberPwd());
//
//	if (result) {
//		System.out.println("니애미");
//	} else {
//		System.out.println("틀림");
//	}
	
	
	
		// 찍피티
		Member user1 = new Member("dooly" , "1234");
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력쳐해보세요");
		String memberId = sc.next();
		System.out.println("비밀번호도 입력쳐해보세요");
		String memberPwd = sc.next();
		// MemberService 객체 생성
        MemberService memberService = new MemberService();
        // 로그인 시도
        String result = memberService.login(user1, memberId, memberPwd);
        System.out.println(result);
        
        sc.close();
    }
	}


