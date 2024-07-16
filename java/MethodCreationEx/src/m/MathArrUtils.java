package m;

import java.util.Arrays;

public class MathArrUtils {

	public static void sum(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("기존 배열 : " + Arrays.toString(num));
		System.out.println("총합 : " + sum);		
	}
	
	public static void average(int[] num) {
		float sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("평균 : " + sum / num.length);
	}
	
	public static void max(int[] num) {
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		
	}
	
	public static void min(int[] num) {
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("최소값 : " + min);
	}
	
	public static void sort(int[] num) {
		Arrays.sort(num);
		System.out.println("오름차순 : " + Arrays.toString(num));
	}
}