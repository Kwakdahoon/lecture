package webkdh.hashmap.해쉬맵;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExMain {
	public static void main(String[] args) {
		// 같은 단어가 횟수
		String words = "Hash table based implementation of the Map interface based Map Hash";
		String wordsLower = words.toLowerCase();
		System.out.println(wordsLower);
		
		String[] arr = wordsLower.split(" ");
		System.out.println(Arrays.toString(arr));
		
		Map<String, Integer> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}
		System.out.println("뽀문 : " + map);
		
		// 또는
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		for(String word : arr) {
			map1.put(word, map1.getOrDefault(word, 0) + 1);
		}
		System.out.println("뽀이찌 " + map1);

		// 출력
		Iterator iter = map.entrySet().iterator();
	
		while(iter.hasNext()) {
			Map.Entry ent = (Map.Entry) iter.next();
			int value = (int)ent.getValue();
			System.out.println(ent.getKey()+ " : " + value);
		}
		
		// TreeMap을 이용해서 정렬
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
		tmap.putAll(map);
		
		System.out.println(tmap);
		
		Iterator tIter = tmap.entrySet().iterator();
		
		while(tIter.hasNext()) {
			Map.Entry ent = (Map.Entry) tIter.next();
			int value = (int)ent.getValue();
			System.out.println(ent.getKey()+ " : " + value);
		}
	}
}
