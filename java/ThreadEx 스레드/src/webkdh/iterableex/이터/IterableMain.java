package webkdh.iterableex.이터;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterableMain {
	public static void main(String[] args) {
		
		System.out.println(3 / 0);
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator listIter = list.iterator();

		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		Iterator intIter = set.iterator();
		display(listIter);
		while(intIter.hasNext()) {
			
		}
	}

	public static void display(Iterator listIter) {
		while(listIter.hasNext()) {
			System.out.println(listIter.next());
		}
	}
}
