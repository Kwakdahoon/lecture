package webkdh.hashmap.영사전;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Factory implements Search{
	// - 영어 단어 등록 (apple) 단어, 의미, 동음이의어
//	Map<String, ArrayList<String>> dictionary = new HashMap<String, ArrayList<String>>();
	Map<String, String> dictionary = new HashMap<>();

//	- 영어단어의 의미 (사과) 등록. (하나의 영어단어에는 여러개의 뜻이 있을 수 있습니다)
	// 기본 생성자
	public Factory() {
	dictionary.put("사과", "apple");
	dictionary.put("이동시키다", "take");
	dictionary.put("구독하다", "take");
	}
	
	@Override
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println();
		System.out.println("현재 단어갯수 : " + dictionary.size());
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 검색");
		System.out.println("3. 단어 삭제");
		System.out.println("9. 단어장 종료");
		System.out.println("0. 단어 전체보기");
		System.out.println("번호 입력 --->");
		System.out.println();

		try {
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1 :
				System.out.println("1. 단어 등록");
				addWord();
				break;
			case 2 :
				System.out.println("2. 단어 검색");
				searchWord();
				break;
			case 3 :
				System.out.println("3. 단어 삭제");
				delWord();
				break;
			case 9 :
				System.out.println("9. 종료");
				System.exit(9);
				break;
			case 0 :
				System.out.println("0. 단어 전체보기");
				사전();
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("유효한 숫자를 입력해주세요");
			sc.nextLine();
		}
	}
	}

	@Override
	public void addWord() { // 단어추가
		String eng = null;
		String kor = null;
			Scanner sc = new Scanner(System.in);
			System.out.println("등록할 단어를 입력하세요 (영어)");
			eng = sc.nextLine();
			if (dictionary.containsKey(eng) == false) {
				System.out.println("뜻을 입력하세요");
				kor = sc.nextLine();
				System.out.println();
			} try {
				dictionary.put(eng, kor);
			} catch (Exception e){
				e.printStackTrace();
				System.out.println("다시 입력해주세요");
			} finally {
				System.out.println("추가됐습니다");
		}
	}
	
	@Override
	public void searchWord() { // 단어검색
			Scanner sc = new Scanner(System.in);
			String eng = sc.nextLine();
			System.out.println("단어를 입력하세요");
			if(dictionary.containsValue(eng)) {
				System.out.println("의미 : " + dictionary.get(eng));
			} else {
				System.out.println("조회되는 단어가 없습니다. 추가해주세요");
		}
	}
	
	@Override
	public void delWord() { // 단어삭제
		System.out.println("삭제하고싶은 단어를 입력하세요");
			Scanner sc = new Scanner(System.in);
			String eng = sc.nextLine();
			if (dictionary.containsValue(eng)) {
				dictionary.remove(eng);
				System.out.println("당신이 입력한 " + eng + "는(은) 삭제됐습니다");
			} else {
				System.out.println("이 사전에는 없는 단어입니다");
		}
	}
	
	@Override
	public void 사전() {
		System.out.println("모든 단어");
		for (Map.Entry<String, String> word : dictionary.entrySet()) {
			System.out.println();
			System.out.println(word.getKey() + " : " + word.getValue());
			System.out.println();
		}
	}
}
