package webkdh.bytestreamex바이트스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteMain2 {
	
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("E:\\temp\\test2.dat");
			
			byte[] array = {10, 20, 30, 40, 50};
			
			os.write(array);
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
