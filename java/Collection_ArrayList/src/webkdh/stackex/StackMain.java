package webkdh.stackex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("최범준");
		stack.push("장준호");
		stack.push("곽다훈");
		stack.push("윤희성");
		
		System.out.println(stack);
		System.out.println(stack.pop()); // 마지막 인덱스부터
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println();
		Queue<String> queue = new LinkedList<String>();
		queue.offer("1김민성");
		queue.offer("2김준범");
		queue.offer("3송인서");
		queue.offer("4신용호");
		
		System.out.println(queue);
		System.out.println(queue.poll()); // 0번부터
		System.out.println(queue.poll()); // 
		System.out.println(queue.peek()); // 제거는 안되고 확인하고 다시 넣음
		System.out.println(queue.poll()); // 
		System.out.println(queue.poll()); //
		System.out.println(queue);
		
		
	}
}
