package webkdh;

public class AccountMain2 {

	public static void main(String[] args) {
        // 테스트 코드
        Account account = new Account();
        account.deposit(1000);    // 1000원이 입금되었습니다.
        account.withdraw(500);    // 500원이 출금되었습니다.
        account.withdraw(600);    // 잔액이 부족합니다.
        account.deposit(-200);    // 유효하지 않은 금액입니다.
        System.out.println("현재 잔액: " + account.getBalance()); // 현재 잔액: 500
    }
}
