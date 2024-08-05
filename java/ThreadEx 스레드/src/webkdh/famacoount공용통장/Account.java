package webkdh.famacoount공용통장;

public class Account {
	private int balance = 10000;

	public int getBalance() {
		return balance;
	}
	
	public boolean withdraw(int money) {
		boolean result = false;
		
		synchronized (this) {
			if (this.balance >= money) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.balance -= money;
				result = true;
			}
		}
		return result;
	}
}
