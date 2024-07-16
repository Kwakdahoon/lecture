package webkdh;

import java.util.Arrays;

public class CarMain {
	static void initCar(Car car, String brandName, String modelName, int price, String color) {
		car.brandName = brandName;
		car.modelName = modelName;
		car.price = price;
		car.color = color;
	}

	public static void main(String[] args) {
		// Car 객체 생성
		Car car1 = new Car();
		car1.displayCar();
		
		Car car2 = new Car();
		car2.brandName = "기아";
		car2.modelName = "k5";
		car2.price = 2500000;
		car2.color = "회색";
		car2.displayCar();
		
		Car car3 = new Car();
		initCar(car3, "제네시스", "gv80", 29, "검정");
		car3.displayCar();
		
		Car car4 = new Car();
		car4.createCar("기아", "모닝", 25000, "흰색");
		car4.displayCar();
	}

}
