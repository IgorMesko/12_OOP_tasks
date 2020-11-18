package by.htp.home.client;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String nameClient;
	private String patronymicClient;
	private String surnameClient;
	private String passportIdClient;
	private List<Account> accounts;
			
	public Client(String nameClient, String patronymicClient, String surnameClient, String passportIdClient) {	
		this.nameClient = nameClient;
		this.patronymicClient = patronymicClient;
		this.surnameClient = surnameClient;
		this.passportIdClient = passportIdClient;
		this.accounts = new ArrayList<>();
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getPatronymicClient() {
		return patronymicClient;
	}

	public void setPatronymicClient(String patronymicClient) {
		this.patronymicClient = patronymicClient;
	}

	public String getSurnameClient() {
		return surnameClient;
	}

	public void setSurnameClient(String surnameClient) {
		this.surnameClient = surnameClient;
	}

	public String getPassportIdClient() {
		return passportIdClient;
	}

	public void setPassportIdClient(String passportIdClient) {
		this.passportIdClient = passportIdClient;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void addNewAccount(Account account) {
		accounts.add(account);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameClient == null) ? 0 : nameClient.hashCode());
		result = prime * result + ((passportIdClient == null) ? 0 : passportIdClient.hashCode());
		result = prime * result + ((patronymicClient == null) ? 0 : patronymicClient.hashCode());
		result = prime * result + ((surnameClient == null) ? 0 : surnameClient.hashCode());
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
		Client other = (Client) obj;
		if (nameClient == null) {
			if (other.nameClient != null)
				return false;
		} else if (!nameClient.equals(other.nameClient))
			return false;
		if (passportIdClient == null) {
			if (other.passportIdClient != null)
				return false;
		} else if (!passportIdClient.equals(other.passportIdClient))
			return false;
		if (patronymicClient == null) {
			if (other.patronymicClient != null)
				return false;
		} else if (!patronymicClient.equals(other.patronymicClient))
			return false;
		if (surnameClient == null) {
			if (other.surnameClient != null)
				return false;
		} else if (!surnameClient.equals(other.surnameClient))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [nameClient=" + nameClient + ", patronymicClient=" + patronymicClient + ", surnameClient="
				+ surnameClient + ", passportIdClient=" + passportIdClient + "]";
	}
}
