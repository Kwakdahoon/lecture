import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 1 ~ 45 사이의 정수중에서 6개를 뽑아서 로또 번호를 생성한다.
		
		// 1 ~ 45사이 랜덤 정수 출력
		System.out.println(Math.floor(Math.random()* 45) + 1);
		
		// 배열 안에 집어넣기
		int[] lottoArr = new int[6];
		for (int i = 0; i < lottoArr.length; i ++) {
			lottoArr[i] = (int) Math.floor(Math.random()* 45) + 1;
		// 중복 제거
		for (int j = 0; j < i; j++) {
			if (lottoArr[i] == lottoArr[j]) {
				i--;
				}
			}
		}
		
		// for 문으로 만들어
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호를 입력하세요 (이 메시지는 6번 뜹니다 인간쓰레기야)");
		int input = sc.nextInt();
		
		System.out.println("로또 번호를 입력하세요 (이 메시지는 6번 뜹니다 인간쓰레기야)");
		int input1 = sc.nextInt();

		System.out.println("로또 번호를 입력하세요 (이 메시지는 6번 뜹니다 인간쓰레기야)");
		int input2 = sc.nextInt();
		
		System.out.println("로또 번호를 입력하세요 (이 메시지는 6번 뜹니다 인간쓰레기야)");
		int input3 = sc.nextInt();
		
		System.out.println("로또 번호를 입력하세요 (이 메시지는 6번 뜹니다 인간쓰레기야)");
		int input4 = sc.nextInt();
		
		System.out.println("로또 번호를 입력하세요 (이 메시지는 6번 뜹니다 인간쓰레기야)");
		int input5 = sc.nextInt();
		
		System.out.println(Arrays.toString(lottoArr));
		
		// 비교해서 
		
		
		// 1 ~ 45 사이의 정수중에서 6개를 뽑아서 로또 번호를 생성한다.
		int[] pool = new int[45];
		for (int i = 0; i < pool.length; i ++) {
			pool[i] = i + 1;
		}
//		System.out.println("맨 첨 : " + Arrays.toString(pool));
		// 해당 배열 안에서 섞는다 (shuffle).
		int temp = 0;
		for (int i = 0; i < 45; i ++) {
			// 랜덤한 인덱스 번호 추출 [0 ~ 44]
			int k = (int) (Math.random() * 45); // double(실수) -> int(정수) 형변환
//			System.out.println("K : " + k);
			// swap
			temp = pool[i];
			pool[i] = pool[k];
			pool[k] = temp;
//			System.out.println(Arrays.toString(pool));
		}
		
		
		// 랜덤하게 섞인 배열안에서 숫자 6개를 뽑아낸다.
		for (int i = 0; i < 6; i++) {
			System.out.println(pool[i]);
		}
		
		
		
		
		
	}

}
