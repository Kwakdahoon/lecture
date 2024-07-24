package webkdh;

import pet.Cat;
import pet.Dog;

public class PetMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("거봉", "포메", 4);
		Cat myCat = new Cat("보풀", "브리티쉬 숏헤어", 1);
		PetDc 곽다훈 = new PetDc("다훈", 25);
		Pet 우리집애완동물 = new Dog("신", "신", 15);
		
		
		// 강아지
		System.out.println(myDog.toString());
		myDog.doCry();
		myDog.doWag();
		
		// 고양이
		System.out.println(myCat.toString());
		myCat.doCry();
		myCat.doScratch();
		myCat.doJump();
		System.out.println();
		
		// 닥터
		곽다훈.doCure(myDog);
		곽다훈.doCure(myCat);
		
		//
		우리집애완동물.doCry();
		우리집애완동물.doWalk();
//		우리집애완동물.doWag();
		
//		((Pet)우리집애완동물).doCure(); 
		
	}

}
