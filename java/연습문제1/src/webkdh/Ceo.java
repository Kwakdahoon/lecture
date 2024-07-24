package webkdh;

public class Ceo {
	private String name; // 이름
	private String position; // 직급
	private String gender; // 성별
	
	public Ceo(String name, String position, String gender) {
		this.name = name;
		this.position = position;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getgender() {
		return gender;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}
	
	// 메서드 오버로딩
	public void salSal (Department d) {
		System.out.println(d.toString() + "\n" + getName() + " : 이것도 아깝지만 어서 받고 개처럼 일하렴");
	}
}
