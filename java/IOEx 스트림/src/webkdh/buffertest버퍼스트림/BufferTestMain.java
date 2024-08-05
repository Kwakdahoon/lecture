package webkdh.buffertest버퍼스트림;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferTestMain {
	
	public static void main(String[] args) throws IOException {
		String originalFilePath = "E:\\temp\\beach.jpg";
		String copyFilePath = "E:\\temp\\copybeach.jpg";
		String originalFilePath2 = "E:\\temp\\beach.jpg";
		String copyFilePath2 = "E:\\temp\\copybeach2.jpg";
		
		// 입출력스트림 생성
		FileInputStream fis = new FileInputStream(originalFilePath);
		FileOutputStream fos = new FileOutputStream(copyFilePath);
		
		fis.close();
		fos.close();
		
		// 입출력스트림 생성 + 버퍼 스트림
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(copyFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		copy(bis, bos);
		bis.close();
		bos.close();
	}

	public static void copy(InputStream is, OutputStream os) throws IOException {
		long start = System.nanoTime();
		while (true) {
			int data = is.read();
			if (data == -1) break;
			os.write(data);
		}
		
		os.flush();
		
		long end = System.nanoTime();
		System.out.println((end - start) + end - start);
	}
}
