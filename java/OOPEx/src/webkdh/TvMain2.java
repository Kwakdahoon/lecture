package webkdh;

public class TvMain2 {

	public static void main(String[] args) {
		TvData data = new TvData(); // 티비객체 생성
		
		data.isOn = true; // 티비 켜기
		System.out.println("티비가 켜집니다.");
		
		data.volume++;
		System.out.println("TV 볼륨 : " + data.volume);
		
		data.volume++;
		System.out.println("TV 볼륨 : " + data.volume);
		
		data.volume--; // 볼륨감소
		System.out.println("TV 볼륨 : " + data.volume);
		
		// 상태확인
		if(data.isOn == true) {
			System.out.println("TV가 쳐켜져있습니다, 볼륨 : " + data.volume);
		} else {
			System.out.println("꺼지세요");
		}
		
		data.isOn = false; // 티비끄기
		System.out.println("티비를 쳐끕니다 인생패배자새끼");
	}
	}


