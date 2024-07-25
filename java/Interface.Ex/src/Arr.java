import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr extends User {
	
	public static void main(String[] args) {
		// ArrayList를 사용해서 User 5명을 넣고, 출력하기 
		// ArrayList는 User타입 이어야한다.
		User u1 = new User("assd", "3");
		User u2 = new User("asdd", "3");
		User u3 = new User("asfd", "3");
		User u4 = new User("asgd", "3");
		
		String sumP = "";
		List<User> arr = new ArrayList<User>(3);
		User[] users = new User[5];
		users[0] = new User("rlf", "2");
		// 방법1 . 배열로 유저 넣기
		// arr이 없어지면 user도 사라진다.
		for(int i=0; i<5; i++) {
			arr.add(users[0]);
		}
		
		for (User e : arr) {
			e.getName();
		}
		
		for(int i=0; i<arr.size(); i++) {
		 System.out.println(arr.get(i).getName());
		}
	}

}
