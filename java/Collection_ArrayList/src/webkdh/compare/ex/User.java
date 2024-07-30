package webkdh.compare.ex;

public class User implements Comparable<User>{
	private String userId;
	private int age;
	
	public User (String userId, int age) {
		this.userId = userId;
		this.age = age;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public int compareTo(User o) {
		// age로 비교해서 정렬
//		return this.age < o.age ? -1 : this.age == o.age ? 0 : 1; // 오름차
		return this.age < o.age ? 1 : this.age == o.age ? 0 : -1; // 내림차
	}
	
	@Override
	public String toString() {
		return "이름 " + userId + ", 나이" + age;
	}
}