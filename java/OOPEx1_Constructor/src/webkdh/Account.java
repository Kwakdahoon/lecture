package webkdh;

public class Account {
	private int balance = 0; // 계좌 잔액
	int deposit; // 입금
	int withdraw; // 출금
	int getbalance; // 현재 금액
	
	// 입금 메서드
	public void deposit(int amount) {
		if (isValid(amount)) {
			balance += amount;
			System.out.println(amount + "원이 입금되었습니다.");
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}
	// 출금 메서드
	public void withdraw(int amount) {
		if (isValid(amount) && (this.balance - amount) >= 0) {
			balance -= amount;
				System.out.println(amount + "원이 출금되었습니다.");
			} else {
				System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
			}
	}
	
	// 잔액 조회 메서드
	public int getBalance() {
		return balance;
	} 
	
    // 금액이 유효한지 검사하는 private 메서드
    private boolean isValid(int amount) {
        return amount > 0;
    }
}
