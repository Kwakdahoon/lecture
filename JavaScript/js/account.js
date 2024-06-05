

function Account (owner, accNum, balance) {         // 파스칼표기 1
    this.owner = owner;
    this.accNum = accNum;
    this.balance = balance;
    this.name = "직장인 비과세 예금";
    this.bankName = "우리은행";

    // console.log(this);

    // 객체 기능 부여 (메서드) 3
    this.checkBalnace = function() {
        return this.balance;
    }
    this.deposit = function(money) {
        this.balance += money;
    };

    this.withdraw = function(money) {
        if (this.balance >= money) {

            this.balance -= money;
        } else {
            window.alert("잔액이 부족합니다.");
        }
    }
}