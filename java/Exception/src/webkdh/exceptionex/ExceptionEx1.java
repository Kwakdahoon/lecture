package webkdh.exceptionex;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			install();
		} catch (InstallException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage() + "ㅎㅇ");
		}
		
			
		}
	private static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("똥돌리네 " + e.getMessage());
			System.out.println("공간없어 확보하고 마저해");
			InstallException ie = new InstallException("설치중예외발생");
			ie.initCause(e); // 원인예외
			ie.getCause();
			throw ie;
			// 설치준비
		} catch (MemoryExceprion e) {
//			e.printStackTrace();
			System.out.println("예외발생 : " + e.getMessage());
		} finally {
			deleteTmpFiles();
		}
	}
	
	private static void deleteTmpFiles() {
		System.out.println("임시파일을 삭제합니다람쥐");
	}
	private static void copyFiles() {
		System.out.println("파일 복사 시작데스요");
	}
	private static void startInstall() throws SpaceException, MemoryExceprion {
		System.out.println("설치시작해부랄~");
		if (!calSpace()) {
			// 예외발생
			throw new SpaceException("디스크공간없어부랄");
			
		} 
		
		if (!calMemory()) {
			throw new MemoryExceprion("메모리부족대스");
//			throw new RuntimeErrorException(new MemoryExceprion("메모리부족"));
		}
	}
	private static boolean calMemory() {
		// 메모리 계산
		return true;
	}
	private static boolean calSpace() {
		// 설치공간 계산 충분 : true, 불충분 : false
		return false;
	}
}

class SpaceException extends Exception{
	SpaceException(String msg) {
		super(msg);
	}
}
class InstallException extends Exception {
	public InstallException(String msg) {
		super(msg);
	}
}

class MemoryExceprion extends Exception{
	public MemoryExceprion(String msg) {
		super(msg);
	}
}