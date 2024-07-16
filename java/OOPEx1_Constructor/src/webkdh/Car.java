package webkdh;

public class Car {
	// 멤버변수
//	String brandName = "현대";
//	String modelName = "그랜져";
//	int price = 450000000;
//	String color = "검정색";
	
	String brandName;
	String modelName;
	int price;
	String color;
	
	// 멤버 메서드
	void createCar(String brandName, String modelName, int price, String color) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
		this.color = color;
	}
	
	public void displayCar() {
	System.out.println("브랜드명 : " + brandName + ", 모델명 : " + modelName + ", 가격 : " + price + ", 생상 : " + color);
	}
}