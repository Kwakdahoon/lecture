package webkdh.board게시판;

public class Board {
	private int boardId; // 글번호
	private String title; // 제목
	private String content; // 내용
	private String writer; // 글쓴이
	
	public Board(int boardId, String title, String content, String writer) {
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	public int getBoardId() {
		return boardId;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	
}
