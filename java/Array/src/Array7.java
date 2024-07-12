import java.util.Arrays;
import java.util.Iterator;

public class Array7 {

	public static void main(String[] args) {
		// 1 ~ 9 까지의 수를 shuffle 한다. -> 버블 정렬 -> 오름차순으로 정렬결과를 출력한다.
		int[] nine = new int [9];
		// 배열안에 1 ~ 9까지 넣고 중복 X
		int temp = 0;
		for (int i = 0; i < nine.length; i++) {
			nine[i] = (int) (Math.floor(Math.random() * 9 + 1));
			for (int j = 0; j < i; j++) {
				if (nine[i] == nine[j]) {
					i--;
				}
			}
		}
		// 버블정렬 사용해서 오름차순 (asc)
		for (int i = 0; i < nine.length-1; i++) {
			for(int j =0; j < nine.length-1; j++) {
				if(nine[j] > nine[j+1]) {
					temp = nine[j];
					nine[j] = nine[j+1];
					nine[j+1] = temp;
				}
			}
		}

		for (int i:nine) {
			System.out.print(i + " ");
		}
		// 버블정렬 사용해서 내림차순 (desc)
		for (int i = 0; i < nine.length-1; i++) {
			for(int j =0; j < nine.length-1; j++) {
				if(nine[j] < nine[j+1]) {
					temp = nine[j];
					nine[j] = nine[j+1];
					nine[j+1] = temp;
				}
			}
		}
		System.out.println();
		
		for (int i:nine) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("");
		
		int[]arr = new int[9];
		
		for (int i = 0; i < arr.length; i ++  ) {
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < 10 ; i++) {
			int ind = (int)(Math.random() * 9 ); // 0 ~ 8 랜덤한 인덱스
			int tmp = arr[0];
			arr[0] = arr[ind];
			arr[ind] = tmp;
		}
//		System.out.println("shuffle : " + Arrays.toString(arr));
		// -> 버블정렬 -> 오름차순으로 정렬결과를 출력한다.
		for (int i = 0; i < arr.length -1; i++) {
			boolean isSort = false;
//			System.out.println(i);
			for(int j = 0; j < arr.length-1-i; j++) {
			
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					isSort = true;
				}
//				System.out.println(Arrays.toString(arr) + isSort);
			}
			if (!isSort) break;
		}
		System.out.println(Arrays.toString(arr));
	}

}
