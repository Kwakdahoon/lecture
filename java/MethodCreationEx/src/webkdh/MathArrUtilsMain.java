package webkdh;

import java.util.Arrays;

import m.MathArrUtils;
// import m.*; // m패키지의 모든 클래스를 import한다.
public class MathArrUtilsMain {
	
	public static void main(String[] args) {
		
		// 배열에 숫자 넣기
		int[] num = new int[10];	
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.floor(Math.random() * 1000) + 1);
			
		// 중복제거
		for (int j = 0; j < i; j++) {
			if (num[i] == num[j]) {
				i--;
				}
			}
			
		}
		MathArrUtils.sum(num);
		MathArrUtils.average(num);
		MathArrUtils.min(num);
		MathArrUtils.max(num);
		MathArrUtils.sort(num);

	}
}