package webkdh;

public class MobilePhone2 {
	String modelName;
	String brandName;
	int mainMemory;
	String color;
	
	public MobilePhone2 () {
		System.out.println("호갱님~ 후장 개통됐습니다");
	}
	
	// 생성자 오버로딩
	public MobilePhone2( String brandName, String modelName, int mainMemory , String color) {
		// 생성자에서 다른 생성자를 호출 할 때는 반드시 생성자의 첫 문장에 써야한다
//		this();
		this.brandName = brandName;
		this.modelName = modelName;
		this.mainMemory = mainMemory;
		this.color = color;
	}
	
	public MobilePhone2(String modelName, String brandName) {
//		this.modelName = modelName;
//		this.brandName = brandName;
//		this.mainMemory = 256;
//		this.color = "흰색";
		this(brandName, modelName, 256, "흰색");
	}
	
	public MobilePhone2 (String color, int mainMemory) {
		this(null, null , mainMemory, color);
		this.brandName = "삼성";
		this.modelName = "플립";
	}
	
	public MobilePhone2(int mainMemory, String brandName) {
		this("흰색" , mainMemory);
		this.brandName = brandName;
	}
	// 메서드
	public String toString () {
		return "[" + this.getClass().getName() + ": " + this.hashCode() +
				"]= brandName : " + this.brandName +  ", modelName : " + this.modelName +
				", mainMemory : " + this.mainMemory + " , color : " + this.color;
	}
}
