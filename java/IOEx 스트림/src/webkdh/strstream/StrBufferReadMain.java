package webkdh.strstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrBufferReadMain {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(
									new InputStreamReader(
											new FileInputStream("./src/webkdh/buffertest버퍼스트림/BufferTestMain.java")));
//			br = new BufferedReader(new FileReader("./src/webkdh/buffertest버퍼스트림/BufferTestMain.java"));
			
			while (true) {
				String str = br.readLine();
				if (str == null) break;
				System.out.println(str);
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		} try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}			
}
