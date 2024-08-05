package webkdh.bytestreamex바이트스트림;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.xml.sax.InputSource;

public class ReadMain1 {

	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("E:\\temp\\test1.dat");
			
//			int data = is.read();
//			System.out.println(data);
//			data = is.read();
//			System.out.println(data);
//			data = is.read();
//			System.out.println(data);
			
			while (true) {
				int data = is.read();
				if(data == -1) break;
				System.out.println(data);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
//			is.read();
		}
	}
}
