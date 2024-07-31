package webkdh.hashmapex.맵;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 저장
		map.put(1, "영우님");
		map.put(2, "다손님");
		map.put(3, "창현님");
		map.put(4, "현명님");
		map.put(5, "연환미");
		map.put(6, "진구님");
		map.put(7, "노진구");
		map.put(7, "강진구"); // key[키] 중첩은 안됨(왼쪽) value[값] 중첩은 됨(오른쪽)
		
		System.out.println(map);
		
		// 탐색
		if (map.containsKey(7)) {
			System.out.println(map.get(7));
		} else {
			System.out.println("해당되는 값이 없습니다.");
		} 
		
		// Map에 있는 모든 키
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			System.out.println(key);
		}
		// map에 있는 모든 값 value
		Collection<String> values = map.values();
//		List<String> listValues = map.values();
		for (String value : values) {
			System.out.println(value);
		}
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(10)); // 키 에 10이 있냐 false
		System.out.println(map.containsValue("둘리")); // 값에 둘리가 있냐 false
		System.out.println(map.getOrDefault(6, "없어")); 
		System.out.println(map.getOrDefault(8, "없어")); // 키에 6이 있으면 value(없어)를 반환
		System.out.println(map.putIfAbsent(8, "업ㅇ서")); // key가 없으면 추가해줌
		System.out.println(map.putIfAbsent(1, "업ㅇ서")); // key가 있으니까 기존의 value를 출력 update X !!
		System.out.println(map);
		
		// 수정
		map.replace(8, "replace"); // 8번키 값을 replace 로
		System.out.println(map);
		
		map.replace(8, "replace", "new value"); // 8번키 값 replace 를 new replace로 바
		System.out.println(map);
		
		// 삭제
		map.put(9,  "sex");
		System.out.println(map);
		
		map.remove(9);
		System.out.println(map);
		
		map.put(10, "sexsex");
		System.out.println(map);
		
		map.remove(10, "sexsex");
		System.out.println(map);
		
	



		// 맵 생성 : key = 학번, value = 성적
		Map<String, Integer> student = new HashMap<String, Integer>();
		
		// 5명 저장
		student.put("0001", 50);
		student.put("0002", 60);
		student.put("0003", 80);
		student.put("0004", 90);
		student.put("0005", 70);
		
		// 총 학생 목록 출력
		Set set = student.entrySet();
		
		Iterator iter = set.iterator(); // <- 이새끼 하는일이 뭐야
		while(iter.hasNext()) {
			Map.Entry<String, Integer> es = (Map.Entry) iter.next(); // <- 이새끼 하는일이 뭐야
			System.out.println("학번 : " + es.getKey() + " , 성적 : " + es.getValue());
		}
		
		Set ks = student.keySet();
		System.out.println("학번만 출력 : " + ks);
		System.out.println("총 학생수 : " + student.size());
		
		Collection values1 = student.values();
		System.out.println("성적만 출력 : " + values1);
		System.out.println("총 학생수 : " + student.size());
		
		// 총점 평균 출력
		int sum = 0;
		Iterator iter1 = values1.iterator();
		while(iter1.hasNext()) {
			Integer i = (int) iter1.next();
			sum += i;
		}
		double avg = sum / student.size();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
//		int tot = 0;
//		Set<String> value = (Set<String>) map.values(); 
//		
//		for (String v : values) {
//			tot += v;
//		} System.out.println("총점수 : " + tot);
//		
//		System.out.println(student);
//		tot = map.keySet()
	}
}
