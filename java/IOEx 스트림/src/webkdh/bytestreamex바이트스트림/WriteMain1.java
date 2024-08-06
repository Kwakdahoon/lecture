package webkdh.bytestreamex바이트스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteMain1 {
	
	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		try {
			
			OutputStream os = new FileOutputStream("E:\\temp\\test1.dat");
			
			// 1바이트 출력
			os.write(a);
			os.write(b);
			os.write(c);
			
//			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
