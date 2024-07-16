package webkdh;

public class MobilePhone {
	private String modelName;
	private String brandName;
	private int mainMemory;
	private String color;
	
	public MobilePhone () {
		System.out.println("호갱님~ 후장 개통됐습니다");
	}
	
	// 생성자 오버로딩
	public MobilePhone( String brandName, String modelName, int mainMemory , String color) {
		// 생성자에서 다른 생성자를 호출 할 때는 반드시 생성자의 첫 문장에 써야한다
//		this();
		this.brandName = brandName;
		this.modelName = modelName;
		this.mainMemory = mainMemory;
		this.color = color;
	}
	
	public MobilePhone(String modelName, String brandName) {
//		this.modelName = modelName;
//		this.brandName = brandName;
//		this.mainMemory = 256;
//		this.color = "흰색";
		this(brandName, modelName, 256, "흰색");
	}
	
	public MobilePhone (String color, int mainMemory) {
		this(null, null , mainMemory, color);
		this.brandName = "삼성";
		this.modelName = "플립";
	}
	
	public MobilePhone(int mainMemory, String brandName) {
		this("흰색" , mainMemory);
		this.brandName = brandName;
	}
	// 메서드
	// getter, setter
	// getter나 setter에 static메서드로 만들 수 있을까
	
//	static String getBrandName() {
//		return brandName;
//	}
	
	String getModelName() {
		return this.modelName;
	}
	int getMainMemory () {
		return this.mainMemory;
	}
	String getColor() {
		return this.color;
	}
	void setBrandName (String brandName) {
		this.brandName = brandName;
	}
	void setModelName(String modelName) {
		this.modelName = modelName;
	}
//	void setMainMemory (int mainMemory) {
//		this.mainMemory = mainMemory;
//	}
	// 메모리를 1TB까지만 업그레이드
	boolean setMainMemory (int mainMemory) {
		boolean result = false;
		if (mainMemory <= 1024) {
			this.mainMemory = mainMemory;
			result = true;
		}
		return result;
	}
	
	
	public String toString () {
		return "[" + this.getClass().getName() + ": " + this.hashCode() +
				"]= brandName : " + this.brandName +  ", modelName : " + this.modelName +
				", mainMemory : " + this.mainMemory + " , color : " + this.color;
	}
}
