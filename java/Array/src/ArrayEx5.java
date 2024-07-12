import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
//		int 배열에 1 ~ 100의 난수 20개를 넣어놓고
//		유저에게 찾을 숫자를 입력받아
//		출력 ex) 찾는 값은 n번째에 있습니다.
		
//		System.out.println((int) (Math.floor(Math.random() * 100) + 1));
		// 1 ~ 100의 난수
		int [] searchNum = new int[20];
//		System.out.println(Arrays.toString(searchNum)); // 0으로 초기화된 배열
		
		// int 배열안에 난수 20개		
		for (int i = 0; i < searchNum.length; i++) {
			searchNum[i] = (int) (Math.floor(Math.random() * 20) + 1);
		}
			System.out.println(Arrays.toString(searchNum));
			
		// 유저에게 찾을 숫자를 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 100사이에 숫자를 입력하세요");
		int randNum = sc.nextInt();
		

		// 배열에 찾는 숫자가 있는지 비교해본다.
		int i = 0;
		boolean isFind = false;
		for (int num : searchNum) {
			if (num == randNum ) { // 찾았다
				isFind = true;
				// 출력
				System.out.println("찾는 값 : " + randNum + "은" + i + "번째에 있습니다.");
			} 
			i++;
		}
		if (!isFind) { // 찾는 값이 없는 경우
			
			System.out.println("없다 없어 니가 찾는 그 숫자");
		}

		
		
		sc.close();
		
	}

}
