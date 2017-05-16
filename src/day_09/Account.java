package day_09;

public class Account {
	static int count;
	private String accNo;
	private int balance;
	
	public Account() { }
	
	public Account(int balance) {
		this.accNo = "201-" + (++count);
		this.balance = balance;
	}
	
	public Account(String accNo, int balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void save(int money) {			//입금
		System.out.println("["+ this.accNo +"]계좌 입금액: " + money);
		balance += money;
	}
	
	public int withdraw(int money) {		//출금
		if(balance >= money) {
			System.out.println("출금액: " + money);
			balance -= money;
			return money;
		} else {
			System.out.println("잔고부족");
			return 0;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	public void print() {
		System.out.printf("Account[%s: %d] \n", accNo, balance);
	}
}





