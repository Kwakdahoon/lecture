package webkdh.hashmap.영사전;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Factory{
	// - 영어 단어 등록 (apple) 단어, 의미, 동음이의어
//	Map<String, ArrayList<String>> dictionary = new HashMap<String, ArrayList<String>>();
	public static Scanner sc = new Scanner(System.in);
	public static Map<String, ArrayList<String>> dictionary = new HashMap<String, ArrayList<String>>();
	public static void main(String[] args) { 
		addWord("apple", "사과");
		addWord("apple", "좆퓨터회사");
		addWord("watch", "보다");
		addWord("watch", "손목시계");
		addWord("bat", "야구좆방망이");
		addWord("bat", "박쥐");
		addWord("cat", "보풀이");
		addWord("cat", "거봉이");
		addWord("cat", "대추");
		addWord("cat", "오뎅");
		// 메뉴출력
		outputMenu();
	}



//	- 영어단어의 의미 (사과) 등록. (하나의 영어단어에는 여러개의 뜻이 있을 수 있습니다)
	// 기본 생성자
//	public Factory() {
//	dictionary.put("사과", "apple");
//	dictionary.put("이동시키다", "take");
//	dictionary.put("구독하다", "take");
//	}
	
	public static void outputMenu() {
		while(true) {
		System.out.println();
		System.out.println("현재 단어갯수 : " + dictionary.size());
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어장 출력");
		System.out.println("3. 검색 단어 -> 뜻");
		System.out.println("4. 검색 뜻 -> 단어");
		System.out.println("5. 단어 삭제");
		System.out.println("9. 종료");
		System.out.print("번호 입력 --->");
		System.out.println();

			int menu = 0;
			try {
				menu = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e){
				System.out.println("잘못입력했으니 다시 입력해주세요");
				 continue; // 메뉴번호를 다시 입력받도록
			}
			switch (menu) {
			case 1 :
				addNewWord();
				break;
			case 2 :
				outputVocaBook();
				break;
			case 3 :
				serachByWord();
				break;
			case 4 :
				serachByMeaning();
				break;
			case 5 :
				deleteWord();
				break;
			case 9 :
				System.exit(9);
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		
	}
	}
	private static void deleteWord() {
		System.out.println("삭제할 단어 입력");
		String wordToDelete = sc.nextLine();
		dictionary.remove(wordToDelete);
}



	private static void serachByMeaning() {
		// 뜻 -> 단어
		boolean isFind = false;
		System.out.println("조회할 뜻을 입력하세요");
		String meaning = sc.nextLine();
		System.out.println("-----" + meaning + "의 단어를 검색합니다.");
		for (Map.Entry<String, ArrayList<String>> entry : dictionary.entrySet()) {
			String word = entry.getKey();
			ArrayList<String> meanings = entry.getValue();
			if (meanings.contains(meaning)) {
				// 뜻을 찾은경우
				isFind = true;
				System.out.println(word);
			}
		}
		if (!isFind) {
			System.out.println("단어가 쳐없습니다...ㅄ아..");
		}
}
	private static void serachByWord() {
		// 단어 -> 뜻
		System.out.println("조회할 단어 입력 ->");
		String wordToSearch = sc.nextLine();
		System.out.println("-----" + wordToSearch + "의 뜻을 검색합니다.");
		ArrayList<String> meainings = dictionary.get(wordToSearch);
		
		if (meainings != null) {
		System.out.println(meainings);
		} else {
			System.out.println("뜻이 없습니다...");
		}
}
	public static void outputVocaBook() {
		// 단어장 출력
//		Set<String> words =  dictionary.keySet();
//		for (String word : words) {
//			// 뜻 가져오기
//			List<String> meanings = dictionary.get(word);
//			for (String meaning : meanings) {
//				System.out.println(" " + meaning);
//			}
//			System.out.println();
//		}
		// Map.Entry 사용
		for (Map.Entry<String, ArrayList<String>> entry : dictionary.entrySet()) {
			String word = entry.getKey();
			ArrayList<String> meaning = entry.getValue();
			System.out.println(word + "	:	" + meaning);
		}
	}

	public static void addNewWord() { // 단어추가
			System.out.print("영어단어등록을 쳐하세요");
			String word = sc.nextLine();
			while (true) {
				System.out.println("뜻을 쳐입력하고 q 를 쳐입력해서 쳐끝내세요");
				String newMeaning = sc.nextLine();
				if (newMeaning.equals("q")) {
					break;
				} else {
					addWord(word, newMeaning);
				}
		}
	}
	
	public static void addWord(String word, String meaning) {
		if (dictionary.containsKey(word)) {
			// 단어장에 단어 존재하는 경우
			dictionary.get(word).add(meaning); // 뜻을 추가
		} else { 
			// 단어장에 단어가 존재하지 않는 경우
			ArrayList<String> meanings = new ArrayList<String>();
			meanings.add(meaning);
			dictionary.put(word, meanings);
		}
	}
}
