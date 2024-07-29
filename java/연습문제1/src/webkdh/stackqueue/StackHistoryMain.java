package webkdh.stackqueue;

import java.util.WeakHashMap;

public class StackHistoryMain {
	public static void main(String[] args) {
		WebHistory webBrowser = new WebHistory();
		
		webBrowser.visitWebPage("homepage");
		webBrowser.visitWebPage("naver");
		webBrowser.visitWebPage("daum");
		webBrowser.visitWebPage("coupang");
		webBrowser.visitWebPage("Java API");
		
		webBrowser.goBack();
		webBrowser.goBack();
		webBrowser.goBack();
		webBrowser.goBack();
		webBrowser.goBack();
		
	}
}
