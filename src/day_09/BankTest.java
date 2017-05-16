package day_09;

public class BankTest {

	public static void main(String[] args) {
/*		Account a1 = new Account("201-4688", 2000);
		a1.print();
		Account a2 = new Account("201-5961", 10200);
		a2.print();
		Account a3 = new Account("201-9205", 52700);
		a3.print();
		a3.save(9000);
		a3.print();
		a2.save(a1.withdraw(3000));*/
		
		
		Account[] accounts = new Account[10];
		for(int i=0; i<accounts.length; i++) {
			accounts[i] = new Account(5000);
		}
		
		Bank bank = new Bank(accounts);
		System.out.println("==== Account List All =====");
		bank.print();
		System.out.println("==== Account Search ====");
		Account ac = bank.searchAccount("201-7");
		if(ac == null) {
			System.out.println("계좌 확인 필요");
			return;
		} 
		ac.save(7000);
		ac.print();
		//bank.searchAccount("201-3");
	}
}
