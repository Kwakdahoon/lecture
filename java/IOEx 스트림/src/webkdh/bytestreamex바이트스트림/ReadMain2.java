package webkdh.bytestreamex바이트스트림;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.io.IOException;

public class ReadMain2 {
	
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("E:\\temp\\test2.dat");
			
//			byte[] data = new byte[3];
//			
//			int num = is.read(data, 0 , 2); // 읽은 데이터 갯수 반환
//			System.out.println("(1) num + " + num); // 2
//			System.out.println(Arrays.toString(data)); // [10, 20, 0]
//			
//			num = is.read(data, 0 , 2); // 읽은 데이터 갯수 반환
//			System.out.println("(2) num + " + num); // 2
//			System.out.println(Arrays.toString(data)); // [30, 40, 0]
//			
//			num = is.read(data, 0 , 2); // 읽은 데이터 갯수 반환
//			System.out.println("(3) num + " + num); // 1
//			System.out.println(Arrays.toString(data)); // [50, 40, 0]
//			
//			num = is.read(data, 0 , 2); // 읽은 데이터 갯수 반환
//			System.out.println("(3) num + " + num); // -1
//			System.out.println(Arrays.toString(data)); // [50, 40, 0]
			byte[] data = new byte[50];
			while (true) {
				int num = is.read(data);
				if (num == -1) break;
				
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
