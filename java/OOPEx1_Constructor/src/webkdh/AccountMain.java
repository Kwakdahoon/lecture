package webkdh;

public class AccountMain {

	public static void main(String[] args) {
        // 테스트 코드
        Account account = new Account();
        account.deposit(0);    // 1000원이 입금되었습니다.
        account.deposit(1000);    // 1000원이 입금되었습니다.
        System.out.println("현재 잔액: " + account.getBalance());
        account.withdraw(0);    // 500원이 출금되었습니다.
        account.withdraw(500);    // 500원이 출금되었습니다.
        System.out.println("현재 잔액: " + account.getBalance()); // 현재 잔액: 500
    }
}
