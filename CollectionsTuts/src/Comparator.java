import java.util.Comparator;

class SortByBalance implements Comparator<BankAccount> {
	
	@Override
	public int compare(BankAccount a, BankAccount b) {
		return (int)(a.getBalance() - b.getBalance());
	}
}

class SortByAccountNumber implements Comparator<BankAccount>{
	
	@Override
	public int compare(BankAccount a, BankAccount b) {
		return (int)(a.getAccount_no() - b.getAccount_no());
	}
}