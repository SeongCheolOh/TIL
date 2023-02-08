package javaMid10.p480;

public class Account {
	private long balance; // 잔고 필드 선언
	public Account() {// 생성자
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientException {
		if(balance<money) {
			throw new InsufficientException("잔고가 부족하여 출금할 수 없습니다 " + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}
