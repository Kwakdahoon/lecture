package webkdh.famacoount공용통장;

public class FamAccMain {

	public static void main(String[] args) {
		
//		Family 아빠 = new Family("아빠");
//		Family 엄마 = new Family("엄마");
//		Family 나 = new Family("나");
//		
//		Thread fth = new Thread(아빠);
//		Thread mth = new Thread(엄마);
//		Thread nth = new Thread(나);
		
		Runnable fam = new Family("족가");
		Thread fth = new Thread(fam);
		Thread mth = new Thread(fam);
		Thread nth = new Thread(fam);
		
		fth.start();
		mth.start();
		nth.start();
	}

}
