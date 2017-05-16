package day_09;

public class Bank {
	Account[] accounts;

	public Bank() {};
	public Bank(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public void addAccount(Account c) {
		
	}

	public Account searchAccount(String account) {
/*		for(int i=0; i<accounts.length; i++) {
			if(accounts[i].getAccNo().equals(account)) {
				System.out.println("���¹�ȣ: [" + accounts[i].getAccNo() + "], �ܰ�: ["+ accounts[i].getBalance() +"]");
				break;
			}
		}*/
		
		for(Account data : accounts) {
			if(data.getAccNo().equals(account)) {
				data.print();
				//System.out.println("���¹�ȣ: [" + data.getAccNo() + "], �ܰ�: ["+ data.getBalance() +"]");
				return data;
			}
			
		}
		return null;
	}
	
	public void print() {
		for(Account data : accounts) {
			data.print();
		}
	}
}
