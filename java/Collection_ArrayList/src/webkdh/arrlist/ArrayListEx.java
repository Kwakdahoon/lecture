package webkdh.arrlist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		
		// 데이터 추가
		list.add(10);
		list.add(30);
		list.add(1, 20); // 인덱스 1번째에 20을 넣음
		list.add(new Integer(1));
		list.add(new Integer(50));
		
		System.out.println(list.toString());
		System.out.println(list);
		
		// 데이터 얻어오기 
		int a = (Integer)list.get(2); // list 2번째에 값을 가져옴
		System.out.println(a);
		
		// 리스트의 길이
		System.out.println("list의 길이는 : " + list.size());
		
		
		
		ArrayList list2 = new ArrayList(list.subList(1, 3)); // 인덱스 1번째부터 3번 이전까지만 뽑아옴
		display(list, list2);
		
		// contains()
		ArrayList list3 = new ArrayList();
		list3.add("A");
		list3.add("B");
		list3.add("C");
		System.out.println(list3.contains("B")); // list3에 B가 있느냐 있으면 true 반환 true
		System.out.println(list3.contains("D")); // list3에 B가 있느냐 있으면 true 반환 false
		
		list3.set(0, "AA"); // 0번째 인덱스 요소를 "AA" 수정
		System.out.println(list3);
		list.add(0, "1"); // 0번째 요소에 String타입으로 1넣어주기
		System.out.println(list);
		
		System.out.println("list.indexOf(\"1\") : " + list.indexOf("1")); // 0번째에 String 타입
		System.out.println("list.indexOf(\"1\") : " + list.indexOf(new Integer(1))); //4번째에 Integer 타입
		
		// 삭제
		list.remove(1); // 1번째 인덱스 삭제
		System.out.println(list);
		
		list.remove("1"); // String type에 1을 삭제
		System.out.println(list); 
		
		list.remove(new Integer(1)); // Integer type에 1을 삭제
		System.out.println(list);
		
		// retainAll()
		ArrayList list4 = new ArrayList();
		list4.add(0);
		list4.add(1);
		list4.add(2);
		list4.add(3);
		list4.add(4);
		
		ArrayList list5 = new ArrayList();
		list5.add(1);
		list5.add(2);
		list5.add("A");
		list5.add("B");
		list5.add("C");
		
		display(list4, list5);
		
		System.out.println("retainAll() ---------------");
		// list4에서 list5와 겹치는 부분만 남기고 나머지는 삭제 (교집합적인)
		list4.retainAll(list5);
		display(list4, list5);
		
//		System.out.println("removeAll() ---------------");
		// list5에서 list4에 포함된 요소들을 삭제
//		list5.removeAll(list4);
//		display(list4, list5);
		
		// list5에서 list4에 포함된 요소들을 삭제
		System.out.println("list5에서 list4에 포함된 요소들을 삭제");
//		for (int i = 0; i < list5.size(); i++) {
		for (int i = list5.size() -1; i >= 0; i--) {
			if (list4.contains(list5.get(i))) {
				list5.remove(i);
				System.out.println("i : " + i + "," + list5);
			}
		}
		display(list4, list5);
		
		// clear() -- 모든 요소 삭제
		list5.clear();
		System.out.println(list5);
		
	}
	public static void display(ArrayList list1, ArrayList list2) {
		System.out.println("list 4 : " + list1);
		System.out.println("list 5 : " + list2);
	}
}
