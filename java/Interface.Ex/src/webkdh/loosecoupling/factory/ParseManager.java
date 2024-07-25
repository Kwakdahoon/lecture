package webkdh.loosecoupling.factory;

public class ParseManager {
		public static Parseable getParser(String fileName) {
			
			Parseable result = null;
			String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
			System.out.println("파일의 확장자 : " + ext);
			
			if (ext.equals("json")) {
				result = new JasonParser();
			} else if (ext.equals("xml")) {
				result = new XmlParser();
			} else if (ext.equals("yaml")){
				result = new YamlParser();
			} else {
				result = new NoParser();
			}
			return result;
			}
}
