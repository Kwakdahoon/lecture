package webkdh.오름차내림차정렬;

import java.util.Comparator;

public interface Sortable extends Comparator <Student>{

	int compare(Student o1, Student o2);
	
}
