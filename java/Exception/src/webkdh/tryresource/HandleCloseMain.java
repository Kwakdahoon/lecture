package webkdh.tryresource;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HandleCloseMain {
	
	public static void main(String[] args) {
		// E:\lecture\java\Exception\src\webkdh\tryresource
				// 전역변수로 두기 2
		//		FileInputStream fis = null;
		//		try {
		//		fis = new FileInputStream("E:\\lecture\\java\\ExceptionEx\\src\\webkdh\\tryresource\\score.dat");
		//		} catch (FileNotFoundException e) {
		////			e.printStackTrace();
		//			System.out.println("파일이 없음");
		//		} finally {
		//			DataInputStream dis = new DataInputStream(fis); //매개변수로 받으려면 1
		//			try {
		//				dis.close();
		//			} catch (IOException e) {
		//				// TODO Auto-generated catch block
		//				e.printStackTrace();
		//			}
		//		}
				
		// 자동으로 close()호출을 해준다. (단, AutoCloseable인터페이스를 구현한 것이어야 한다.)	
		try (FileInputStream fis = new FileInputStream("E:\\lecture\\java\\ExceptionEx\\src\\webkdh\\tryresource\\score.dat");
		DataInputStream dis = new DataInputStream(fis)) {
		} catch (IOException e) {
			System.out.println("파일 없음");
//			e.printStackTrace();
			
		}
//		try (FileInputStream fis = new FileInputStream("E:\\lecture\\java\\ExceptionEx\\src\\webkdh\\tryresource\\score.dat");
//		DataInputStream dis = new DataInputStream(fis)) {
//		} catch (IOException e) {
////			e.printStackTrace();
//			System.out.println("파일이 없습니다.");
//		}
	}
}
