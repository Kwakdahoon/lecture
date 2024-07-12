import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 유저에게 n개의 정수를 입력받아 배열에 저장한 후,
		// 최소값, 최대값을 찾아서 출력하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		int n = 4;
		int[] userInputArray = new int[n]; 
		int length = userInputArray.length; // [0,0,0,0]

		// 입력받는 for문
		for (int i = 0; i < n; i++) {
			System.out.println("숫자를 입력하세요");
			userInputArray[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(userInputArray));
		
		int min = userInputArray[0];
		int max = userInputArray[0];
		
		for (int i = 1; i < n; i++) {
            if (userInputArray[i] < min) {
                min = userInputArray[i]; 
            }
            
            if (userInputArray[i] > max) {
                max = userInputArray[i]; 
            }
        }
        
        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
		
	

		
	}

}
