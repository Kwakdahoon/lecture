package webkdh.poker포커;

import java.util.Comparator;

public class SortCard implements Comparator<Card>{


	@Override
	public int compare(Card o1, Card o2) {
		return o1 < o2 ? -1 : o1 >= o2 ? 0 : 1;
	}

}
