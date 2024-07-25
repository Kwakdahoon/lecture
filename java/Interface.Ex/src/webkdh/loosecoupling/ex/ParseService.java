package webkdh.loosecoupling.ex;

import org.omg.CORBA.SetOverrideType;

public class ParseService {
	
	public void processParse(String fileName) {
		String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
		System.out.println("파일의 확장자 : " + ext);
		
		boolean result = false;
		
		if (ext.equals("json")) {
			JasonParser jP = new JasonParser();
			result = jP.parse();
		} else if (ext.equals("xml")) {
			XmlParser xP = new XmlParser();
			result = xP.parse();
		} else if (ext.equals("yaml")){
			YamlParser yP = new YamlParser();
			result = yP.parse();
		} else {
			System.out.println("ㄴㅇㅁ");
		}
		
		if (result) {
			System.out.println("파싱 완료");
		} else {
			System.out.println("파싱패");
		}
	}
}
