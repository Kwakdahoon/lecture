package webkdh.fileex필릭스;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class FileExMain {
	public static void main(String[] args) {
		// 현재 디렉토리의 File객체 생성
		File curDirectory = new File(".");
		int flieCnt = 0;
		int dirCnt = 0;
		int totalSize = 0; // 파일의 총 용량
		
		
		File[] files = curDirectory.listFiles();
//		System.out.println(Arrays.toString(files)); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		
		if (files != null) {
			for (File file : files) {
				String lastModified = sdf.format(file.lastModified());
//				System.out.println(lastModified);
//				System.out.println(file.getName());
//				System.out.println(file.isDirectory());
				String dirOrFileSize = file.isDirectory() ? "<DIR>" : file.length() + "";
//				String temp = file.isDirectory() ? "<DIR>" : String.valueOf(file.length());
				System.out.printf("%-25s %10s %s\n", lastModified, dirOrFileSize, file.getName());
				
				// 파일이나 디렉토리 갯수와 파일의 총 용량
				if (file.isDirectory()) {
					// 디렉토리인 경우
					dirCnt++;
				} else {
					// 파일인 경우
					flieCnt++;
					totalSize += file.length();
				}
				 
			} // for문 끝
			
			DecimalFormat df = new DecimalFormat("#,###");
			
			System.out.println(flieCnt + "개 파일 \t" + totalSize + "바이트");
			System.out.println(dirCnt + "개 디렉터리 \t" + df.format(curDirectory.getUsableSpace()) + " 바이트");
//			System.out.println("totalspace : " + curDirectory.getTotalSpace());
//			System.out.println("getUsableSpace : " + df.format(curDirectory.getUsableSpace()) + " 바이트");
//			System.out.println("getFreeSpace : " + curDirectory.getFreeSpace());
		} // if 문 끝
		System.out.println(sdf.format(files[1].lastModified()));
	} // main 끝
}
