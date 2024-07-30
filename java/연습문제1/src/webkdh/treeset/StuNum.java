package webkdh.treeset;

import java.util.Comparator;

public class StuNum implements Comparator<StuScore>{
	@Override
	public int compare(StuScore o1, StuScore o2) {
		return o2.getStuNum().compareTo(o1.getStuNum());
	}
}