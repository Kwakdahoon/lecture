package webkdh.loosecoupling.ex;

import org.omg.CORBA.SetOverrideType;

public class ParseService {
	public void processParse(String fileName) {
		
		String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println("파일의 확장자 : " + ext);
		Parse parse = null;
		boolean result = false;
		
		if (ext.equals("json")) {
			parse = new JasonParser();
		} else if (ext.equals("xml")) {
			parse = new XmlParser();
		} else if (ext.equals("yaml")){
			parse = new YamlParser();
		} else {
			System.out.println("없는데?");
		}
		if (result) {
			System.out.println("파싱 완료");
		} else {
			System.out.println("파싱 실패");
		}
	}
}
