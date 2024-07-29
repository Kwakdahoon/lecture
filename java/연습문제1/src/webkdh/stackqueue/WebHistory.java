package webkdh.stackqueue;

import java.util.Stack;

public class WebHistory {

	private Stack<String> history = new Stack<String>();
	private String currentPage = null;
	
	public void visitWebPage(String webAddr) {
		if (currentPage != null) {
			history.push(currentPage);
		}
		currentPage = webAddr;
		System.out.println("방문한 웹페이지 : " + webAddr);
	}
	
	public void goBack() { // 뒤로 가기
		if (!history.isEmpty()) {
			
		currentPage = history.pop();
		System.out.println("뒤로가기 클릭");
		System.out.println("현재 페이지 : " + currentPage);
		} else {
			System.out.println("첫페이지 데스");
		}
	}

}
