package webkdh.오름차내림차정렬;

import java.util.Comparator;

public class SortManager {

	public static Sortable getSortMethod(int num) {
		Sortable  result = null;
		
		switch (num) {
		case 1:
			result = new AscendingByStuNo();
			break;
		case 2:
			result = new AscendingByStuName();
			break;
		case 3:
			result = new DescendingByStuScore();
			break;
		case 9 :
			System.out.println("종료합니다");
			System.exit(0);
		default:
			System.out.println("1,2,3,9 만 눌러");
			break;
		}
		return result;
	}

}
