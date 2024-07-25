package webkdh.loosecoupling.factory;

import org.omg.CORBA.SetOverrideType;

public class ParseService {
	
	public void processParse(String fileName) {
		
		boolean result = false;

		Parseable parser =  ParseManager.getParser(fileName);
		result = parser.parse();
		
		if (result) {
			System.out.println("파싱 완료");
		} else {
			System.out.println("파싱패");
		}
	}
}
