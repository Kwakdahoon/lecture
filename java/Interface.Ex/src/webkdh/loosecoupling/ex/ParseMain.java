package webkdh.loosecoupling.ex;

import javax.xml.transform.Source;

public class ParseMain {

	public static void main(String[] args) {
		ParseService service = new ParseService();
		
//		String filename = "data.json";
//		System.out.println(filename.substring(filename.lastIndexOf(".") + 1));
		
//		파일의 확장자 : json
//		JSON 파일 파싱을 ㅅ ㅣ작대스
//		파싱 완료
//		파일의 확장자 : xml
//		JSON 파일 파싱을 ㅅ ㅣ작대스
//		파싱 완료

		service.processParse("data.json");
		System.out.println();
		service.processParse("data.xml");
		System.out.println();
		service.processParse("data.yaml");
		System.out.println();
		service.processParse("data.yaml");
	}
}