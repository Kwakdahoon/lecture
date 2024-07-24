package webkdh;

public abstract class Pet {
	private String name;
	private String variety;
	private int age;
	
	// 생성자 다른 패키지에서 상속 할 수 있도록 protected (패키지가 다르더라도 접근 가능)
	protected Pet(String name, String variety, int age) {
		this.name = name;
		this.variety = variety;
		this.age = age;
	}

	protected Pet() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 메서드
	public void doWalk() {
		System.out.println("걸어 다닙니다.");
	}
	
	// 추상메서드 어떻게 짖을지 모름 abstract
//	public void doCry() {
//		System.out.println("짖습니다.");
//	}
	public abstract void doCry(); // body 없이 선언부만. 
	
	@Override
	public String toString() {
		return ", 이름 = " + name + ", 품종 = " + variety + ", 나이 = " + age + "]";
	}
}
