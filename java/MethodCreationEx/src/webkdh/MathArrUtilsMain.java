package webkdh;

import java.util.Arrays;

public class MathArrUtilsMain {
	public static void main(String[] args) {
		int[] num = new int[10];	
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.floor(Math.random() * 10000) + 1);
			
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