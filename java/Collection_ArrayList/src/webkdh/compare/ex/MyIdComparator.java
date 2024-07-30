package webkdh.compare.ex;

import java.util.Comparator;

public class MyIdComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		String a = o1.getUserId();
		String b = o2.getUserId();
		
//		return o1.getUserId().compareTo(o2.getUserId()); // 오름차순
//		return o2.getUserId().compareTo(o1.getUserId()); // 내림차순
//		return a.compareTo(b); // 오름차
		return b.compareTo(a); // 내림차
	}
	
}
