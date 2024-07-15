package webkdh;

public class TvMain1 {

	public static void main(String[] args) {
		TvData tv1 = new TvData();
		// 절차지향적
		boolean isOn = false;
		int volume = 0;
		
		isOn = true; // 티비 켜기
		System.out.println("티비가 켜집니다.");
		
		volume++;
		System.out.println("TV 볼륨 : " + volume);
		
		volume++;
		System.out.println("TV 볼륨 : " + volume);
		
		volume--; // 볼륨감소
		System.out.println("TV 볼륨 : " + volume);
		
		// 상태확인
		if(isOn == true) {
			System.out.println("TV가 쳐켜져있습니다, 볼륨 : " + volume);
		} else {
			System.out.println("꺼지세요");
		}
		
		isOn = false; // 티비끄기
		System.out.println("티비를 쳐끕니다 인생패배자새끼");
	}

}
