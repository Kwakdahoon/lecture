package webkdh.loosecoupling.ex;

import javax.xml.transform.Source;

public class ParseMain {

	public static void main(String[] args) {
		ParseService service = new ParseService();
		
//		String filename = "data.json";
//		System.out.println(filename.substring(filename.lastIndexOf(".") + 1));


		service.processParse("data.json");
		System.out.println();
		service.processParse("data.xml");
		System.out.println();
		service.processParse("data.yaml");
		System.out.println();
		service.processParse("data.dahoon");
	}
}