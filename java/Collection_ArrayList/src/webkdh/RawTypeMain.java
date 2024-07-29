package webkdh;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RawTypeMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList<>(); // raw타입의 ArrayList객체 생성 - 경고메시지
		
		arr.add(10);
		arr.add(3.14f);
		arr.add(3.141592);
		arr.add("대한민국");
		arr.add(new Computer());
		System.out.println(arr.toString());
		
		// Generic 타입으로 사용할 것을 권고
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("스트링만");
		arr2.add("저장됨");
		System.out.println(arr2.toString());
		
//		ArrayList<int> ar3 = new ArrayList<int>(); // 안됨
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
//		arr3.add("스트링");
		arr3.add(10);
		arr3.add((int)10.0);
		arr3.add((int)3.141592);
		System.out.println(arr3.toString());
		
		// 위의 형식보다 아래처럼 인터페이스로 다형성을 구현하여 사용하는 것이 이점이 있다.
//		List<String> arr4 = new ArrayList<>(); // 다형성
		List<String> arr4 = new Stack<String>(); 
		// ArrayList -> Stack으로 변경해서 쓰더라도 하위 코드에 영향을 미치지 않는다.
		
		
	}

}


