package im.chap10.sec07_user_define_exception;

public class Account {
	private long balance;

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ����:"+(money-balance)+" ���ڶ�");
		}
		balance -= money;
	}
}

