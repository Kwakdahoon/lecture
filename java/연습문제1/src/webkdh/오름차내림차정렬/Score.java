package webkdh.오름차내림차정렬;

import java.util.Comparator;

public class Score implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getScore(), o2.getScore());
//		return o2.getStuNum().compareTo(o1.getStuNum());
	}
}