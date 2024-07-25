


public class User {
	
	User() {
		
	}
	User(String name,String age) {
		this.name = name;
		this.age = age;		
	}
	private String name;
	private String age;
	
	public String getName() {
		return this.name;
	}
	public String getAge() {
		return this.age;
	}

}
