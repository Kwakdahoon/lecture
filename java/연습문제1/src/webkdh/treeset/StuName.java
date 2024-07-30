package webkdh.treeset;

import java.util.Comparator;

public class StuName implements Comparator<StuScore>{
	@Override
	public int compare(StuScore o1, StuScore o2) {
//		return o1.getName().compareTo(o2.getName()); // 오름차순
		return o2.getName().compareTo(o1.getName()); // 내림차
	}
}