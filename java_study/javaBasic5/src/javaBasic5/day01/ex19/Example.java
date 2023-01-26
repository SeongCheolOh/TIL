package javaBasic5.day01.ex19;

public class Example {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setBalance(10000);
		System.out.println("현재 잔고 : "+ account.getBalance());

		account.setBalance(-100);
		System.out.println("현재 잔고 : "+ account.getBalance());

		account.setBalance(2000000);
		System.out.println("현재 잔고 : "+ account.getBalance());
		
		account.setBalance(3000000);
		System.out.println("현재 잔고 : "+ account.getBalance());
	}

}
