package by.htp.home.client;

public class Account {

	private int accountNumber;
	private boolean statusAccount;
	private String currencyAccount;
	private int amountMoney;
	
	public Account() {
	}
	
	public Account(int accountNumber, String currencyAccount, int amountMoney) {
		this.accountNumber = accountNumber;
		this.currencyAccount = currencyAccount;
		this.amountMoney = amountMoney;
		this.statusAccount = false;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCurrencyAccount() {
		return currencyAccount;
	}

	public void setCurrencyAccount(String currencyAccount) {
		this.currencyAccount = currencyAccount;
	}

	public int getAmountMoney() {
		return amountMoney;
	}

	public void setAmountMoney(int amountMoney) {
		this.amountMoney = amountMoney;
	}
		
	public boolean isStatusAccount() {
		return statusAccount;
	}

	public void setStatusAccount(boolean statusAccount) {
		this.statusAccount = statusAccount;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + amountMoney;
		result = prime * result + ((currencyAccount == null) ? 0 : currencyAccount.hashCode());
		result = prime * result + (statusAccount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (amountMoney != other.amountMoney)
			return false;
		if (currencyAccount == null) {
			if (other.currencyAccount != null)
				return false;
		} else if (!currencyAccount.equals(other.currencyAccount))
			return false;
		if (statusAccount != other.statusAccount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", statusAccount=" + statusAccount + ", currencyAccount="
				+ currencyAccount + ", amountMoney=" + amountMoney + "]";
	}
	
}
