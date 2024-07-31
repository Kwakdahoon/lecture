package webkdh.오름차내림차정렬;

public class AscendingByStuNo implements Sortable {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStuNum().compareTo(o2.getStuNum());
	}

}
