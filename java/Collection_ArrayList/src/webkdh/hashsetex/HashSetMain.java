package webkdh.hashsetex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {
	public static void main(String[] args) {
		HashSet setA = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
//		setA.add("3"); // 중복을 허용하지 않음 (이미 3이 있음)

		System.out.println("setA : " + setA);
		
		HashSet setB = new HashSet();
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		
		System.out.println("setB : " + setB);
		
		// 출력
		Iterator iter = setB.iterator();
//		System.out.println(iter.hasNext()); // true
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// setAdhk setB에 공통으로 있는 요소 (교집합)
		HashSet setInter = new HashSet();
		Iterator iterB = setB.iterator();
		while (iterB.hasNext()) {
			Object temp = iterB.next();
			if (setA.contains(temp)) {
				setInter.add(temp);
			}
		}
		System.out.println("setA와 setB의 교집합 : " + setInter);
		
		System.out.println();
		// 차집합 123678
		HashSet setDiff = new HashSet();
		
		Iterator iterC = setA.iterator();
		while (iterC.hasNext()) {
			Object temp = iterC.next();
			if (!setB.contains(temp)) { // setB가 temp(setA의 요소중 하나)를 포함하고
				setDiff.add(temp);
			}
		}
		System.out.println(setDiff);
		// 합집합 12345678
		HashSet setUni = new HashSet();
		
		iter = setA.iterator();
		while (iter.hasNext()) {
			setUni.add(iter.next());
		}
		iter = setB.iterator();
		while (iter.hasNext()) {
			setUni.add(iter.next());
		}
		System.out.println("합집합 : " + setUni);
//		System.out.println(setB.retainAll(setA)); // [4,5]
//		System.out.println(setA.retainAll(setB)); // [4,5]
//		System.out.println("setA와 setB의 교집합 : " + setA +"," + setB);

//		System.out.println(setA.removeAll(setB)); // [4,5,6,7,8]
//		System.out.println(setA.removeAll(setB)); // [1,2,3]
//		System.out.println("setA : " + setA + ", setB : " + setB);
	}
}