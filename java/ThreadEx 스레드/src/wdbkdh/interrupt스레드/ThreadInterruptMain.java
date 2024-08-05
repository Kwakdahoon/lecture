package wdbkdh.interrupt스레드;

import javax.swing.JOptionPane;

public class ThreadInterruptMain {
	public static void main(String[] args) {
		
		ThreadInterrupt th1 = new ThreadInterrupt();
		th1.start();
		
		String input = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력한 값은 : " + input + "입니다");
		
		th1.interrupt(); // interrupt()를 호출하면 interrupted상태가 treue가 된다.
		System.out.println("th1 : isInterrupted() : " + th1.isInterrupted()); // true : interrup()가 호출됨
		System.out.println("th1 : isInterrupted() : " + th1.isInterrupted()); // true : interrup()가 호출됨
		System.out.println("main : interrupted()" + Thread.interrupted()); // false
	}
}

class ThreadInterrupt extends Thread {
	
	public void run() {
		int i = 10;
		
		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x = 0; x < 250000000L; x++) { // 시간지연
			}
			
			System.out.println("th1 : isInterrupted() : " + this.isInterrupted()); // true : interrup()가 호출됨
			System.out.println("th1 : isInterrupted() : " + this.isInterrupted()); // true : interrup()가 호출됨
			// th1스레드가 interrupt되었는지 상태를 알려주고, false로 초기화한다.
			// interrupt된 후 처음 호출될 때는 true를 반환하고
			// 두번째 호출되면 초기화된 false를 반환한다.
			System.out.println("th1 : interrupted()" + Thread.interrupted()); // true
			System.out.println("th1 : interrupted()" + Thread.interrupted()); // false (초기화된 상태)
		}
	}
}