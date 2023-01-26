package javaBasic5.day01.ex19;

public class Account {

	private int balance; // 외부에서 마음대로 접근하거나 변경하지못하게 private
	//조건 >> 0 <= balance <=1,000,000

	//1. setter와 getter를 이용
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	public int getBalance() {
		return balance;
	}

	// 3. setter의 매개값이 범위를 조건을 초과하면 현재 balance값을 유지
	public void setBalance(int balance) {
		
		if(Account.MIN_BALANCE<= balance && balance <= Account.MAX_BALANCE) {
			this.balance = balance;	
		}
	}

}
