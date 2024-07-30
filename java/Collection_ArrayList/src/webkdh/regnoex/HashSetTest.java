package webkdh.regnoex;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Korean k1 = new Korean("980807-1470724", "곽다훈");
		Korean k2 = new Korean("980807-1470724", "곽다훈");
		Korean k3 = new Korean("980807-1470724", "곽다훈");
		
		Set set = new HashSet(); // 중복허용X
		set.add(k1);
		set.add(k2);
		set.add(k3);
		
		Student s1 = new Student();
		set.add(s1);
		
		k1.equals(s1); // 예외 처리
		
		System.out.println("K1의 해쉬코드 : " + k1.hashCode());
		System.out.println("K2의 해쉬코드 : " + k2.hashCode());
		
		System.out.println(k1.equals(k2));
		
//		System.out.println(k1 == k2); // false
//		System.out.println(k1.getRegNo().equals(k2.getRegNo())); // true
//		System.out.println(k1.getRegNo().hashCode());
//		System.out.println(k2.getRegNo().hashCode());
//		System.out.println(set);
//		
//		System.out.println(k1.equals(k2));
//		System.out.println(set.size());
		System.out.println(set);
		
	}
}