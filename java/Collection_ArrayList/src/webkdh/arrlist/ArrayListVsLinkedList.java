package webkdh.arrlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		System.out.println("추가");
		System.out.println("arraylist : " + add1(al));
		System.out.println("linkedlist : " + add1(ll));

//		System.out.println("중간에 추가하기");
//		System.out.println("arraylist : " + addMid(al));
//		System.out.println("linkedlist : " + addMid(ll));
//		
		System.out.println("삭제하기 (끝에서부터 순서대로)");
		System.out.println("arraylist : " + remove1(al));
		System.out.println("linkedlist : " + remove1(ll));
		
//		System.out.println("삭제하기 (앞에서부터 순서대로)");
//		System.out.println("arraylist : " + remove0(al));
//		System.out.println("linkedlist : " + remove0(ll));
//		System.out.println("접근 시간 테스트");
//		System.out.println("arraylist : " + access(al));
//		System.out.println("linkedlist : " + access(ll));
//		System.out.println("접근 시간 테스트");
	}

	private static long remove0(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}

	private static long remove1(List list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}

	private static long addMid(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(100, "a");
		}
		
		long end = System.currentTimeMillis();
		return end-start;
	}

	private static long add1(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}

	private static long access(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}
