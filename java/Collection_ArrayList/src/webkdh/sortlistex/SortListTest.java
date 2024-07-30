package webkdh.sortlistex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListTest {
	static String wjdfufwjs = ("-------------------정렬전----------------------");
	static String wjdfufgn = ("-------------------정렬후----------------------");
	public static void main(String[] args) {
		String[] arr = {"a","b","e","q","E","W","B","A"};
		Arrays.sort(arr); // 대문자 먼저, 소문자를 사전식으로 정렬(기본)
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); // 대소문 구분 없이 사전식으로 정렬
		System.out.println(Arrays.toString(arr));
		
		List<String> list = new ArrayList<String>();
		list.add("a홍길동");
		list.add("e홍길동");
		list.add("d홍길동");
		list.add("z홍길동");
		
		System.out.println("-------------------정렬전----------------------");
		System.out.println(list);
		System.out.println();

		System.out.println("-------------------정렬후----------------------");
//		list.sort(null);
//		System.out.println(list);

		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// String 타입에는 <,>,<=,>= 연산자 적용 불가
//				if (o1 < o2) {
//					return -1;
//				}
//				return o2.compareTo(o1); // 오름차순
				return o1.compareTo(o2); // 내림차순
			}
		};
		list.sort(comp);
		System.out.println(list);

		// int 정수 arraylist
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(30);
		intList.add(45);
		intList.add(45);
		intList.add(98);
		intList.add(152);
		intList.add(145);
		intList.add(32);
		intList.add(48);
		intList.add(345);
		System.out.println(wjdfufwjs);
		System.out.println(intList);
		
		System.out.println(wjdfufgn);
		intList.sort(null);
		System.out.println("오름차순 : " + intList);
		Comparator<Integer> compara = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
//				오름차순
//				if (o1 < o2) {
//					return -1;
//				} else if (o1 == o2) {
//					return 0;
//				} else {
//					return 1;
//				}
				// 내림차순
//				if (o1 < o2) {
//					return 1;
//				} else if (o1 == o2) {
//					return 0;
//				} else {
//					return -1;
//				}
				
				return o1 < o2 ? 1 : o1 == o2 ? 0 : -1; // 내림차순
			}
		};
		
		intList.sort(compara);
		System.out.println(intList);
	}
}
