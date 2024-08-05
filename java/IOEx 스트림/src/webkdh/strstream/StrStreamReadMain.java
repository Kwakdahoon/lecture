package webkdh.strstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class StrStreamReadMain {
	
	public static void main(String[] args) {
		try 
//		(InputStream is = new FileInputStream("E:\\temp\\Stringtest.txt");
//				Reader reader = new InputStreamReader(is);) // close 안쓰는 방법
		{
			InputStream is = new FileInputStream("E:\\temp\\Stringtest.txt");
			Reader reader = new InputStreamReader(is); // 보조스트림
			
			// 1글자씩 읽어옴
			while (true) {
				int data = reader.read();
				if (data == -1) break;
				System.out.println((char)data);
			}
			reader.close();
			
			Reader reader1 = new FileReader("E:\\temp\\Stringtest.txt");
			// 문자 배열로 읽어옴
			char[] data = new char[60];
			while (true) {
				int num = reader1.read(data);
				if (num == -1) break;
				
//				System.out.println(Arrays.toString(data));
				for (int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
			
			reader1.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
