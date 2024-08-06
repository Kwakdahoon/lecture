package webkdh.board게시판;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardTest {
	public static void main(String[] args) {
		Management mg = new Management();
		// 회원가입
		Member mem1 = new Member("001", "좆길동1");
		Member mem2 = new Member("002", "개길동1");
		Member mem3 = new Member("003", "씹길동1");

		mg.insert(mem1);
		mg.insert(mem2);
		mg.insert(mem3);
		
		// 회원검색
		Member searchMem1 = mg.selectByUserId(mem1.getMemberId());
		System.out.println(searchMem1);
		Member searchMem2 = mg.selectByUserId(mem2.getNickName());
		System.out.println(searchMem2);
		mg.deleteMember("user3"); // 회원삭제
//		System.out.println(mg.selectByUserId("user3"));
		
		// 회원이 게시글을 몇개 작성한다.
		
		List<Member> members = new ArrayList<Member>();
		members.add(mem1);
		members.add(mem2);
		List<Board> boards = new ArrayList<Board>();
		boards.add( new Board(12, "제목1", "내용0", "null"));
		boards.add( new Board(23, "제목2", "내용1", "null1"));
		boards.add( new Board(31, "제목3", "내용2", "null2"));
		boards.add( new Board(41, "제목4", "내용3", "null3"));
		boards.add( new Board(51, "제목5", "내용4", "null4"));
		
		Map<String, Board> bMap = new HashMap<String, Board>();
		bMap.put("1", new Board(12, "제목1", "내용0", "null"));
		bMap.put("2", new Board(12, "제목2", "내용0", "null"));
		Map<String, Map> memboard = new HashMap<String, Map>();
		memboard.put("member", mg.getManage());
		memboard.put("board", bMap);
		
		HashMap<String, Member> newMemMap = (HashMap)memboard.get("member");
		// 출력 : 게시판
		for(Board board : boards) {
			System.out.print("글번호 : " + board.getBoardId());
			System.out.print(", 제목 : " + board.getTitle());
			System.out.println(", 글쓴이 : " + board.getWriter().getNickName());
			System.out.print(", 글번호 : " + board.getBoardId() + "\n");
		}
	}
}
