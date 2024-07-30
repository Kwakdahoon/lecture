package webkdh.compare.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortMain {
	public static String wjdfufwjs = ("---------정렬전----------");
	public static String wjdfufgn = ("---------정렬후----------");
	
	public static void main(String[] args) {
		User user0 = new User("성기사", 478);
		User user1 = new User("성기훈", 420);
		User user2 = new User("성기오", 423);
		User user3 = new User("성기육", 446);
		User user4 = new User("성기칠", 453);
		User user5 = new User("성기팔", 423);
		User user6 = new User("성기구", 405);
		
		List<User> list = new ArrayList<User>();
		
		list.add(user0);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		list.add(user6);

		System.out.println(wjdfufwjs);
		System.out.println(list);
		
		System.out.println(wjdfufgn);
		list.sort(null);
		System.out.println(list); // Comparable 구현 (기본정렬)
		
		System.out.println(wjdfufgn);
		list.sort(new MyIdComparator());
		System.out.println(list);
	}
}
