package webkdh.Inheritance.basic2;

import webkdh.Inheritance.basic1.GasCar;

public class CarMain {

	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.startEngine();
		electricCar.accelerate();
		electricCar.charge();
		
		GasCar gasCar = new GasCar();
		gasCar.startEngine();
		gasCar.accelerate();
		gasCar.fillUpGas();
		// 감소, 시동끄는 기능 클래스에 추가
		electricCar.decelerate();
		electricCar.turnOffEngine();
		
		gasCar.decelerate();
		gasCar.turnOffEngine();
		
		// 부모는 자식의 멤버 사용불가
//		Car car = new car();
//		car. ~~
		// 소방차 추가
		FireEngine fireEngine = new FireEngine();
		fireEngine.startEngine();
		fireEngine.hoseWater();
		fireEngine.accelerate();
		
		// 하이브리드 차
		HybridCar hybridCar = new HybridCar();
		hybridCar.startEngine();
		hybridCar.fillUpGas();
		hybridCar.chargeOnBreak();
		
	}

}
