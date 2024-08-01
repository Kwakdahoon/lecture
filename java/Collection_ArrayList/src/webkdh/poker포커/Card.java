package webkdh.poker포커;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Card {
	private String[] type = {"S", "H", "D", "C"};
	
	private static Map<String, ArrayList<String>> num = new HashMap<>();
	
	public Card() {
		inputNum();
	}
	public void inputNum() {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
				1,2,3,4,5,6,7,8,9,10,11,12,13
				));
		String a = "";
		for (int i = 0; i < numbers.size() + 1; i++) {
			a += type[i];
			System.out.println(a);
		}
	}
}
