package by.htp.home.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Logic {
	
	// Список всех клиентов банка
	public List<Client> allClients(Bank bank){
		List<Client> listClients = new ArrayList<Client>();
		
		for(Client i: bank.getClients()) {
			 listClients.add(i);
		}
		return listClients;
	}
	
	//Поиск клиента по серии паспорта
	public List<Client> searchClients(Bank bank, String passportIdClient){
		List<Client> listClients = new ArrayList<Client>();
		
		for(Client i: bank.getClients()) {
			if(i.getPassportIdClient().equalsIgnoreCase(passportIdClient)) {
				listClients.add(i);
			}
		}
		return listClients; 
	}
	
	//Поиск всех счетов клиента 
	public List<Account> searchAccounts(Client client, String passportIdClient){
		List<Account> listAccounts = new ArrayList<Account>();
		
		for(Account i: client.getAccounts()) {
			if(client.getPassportIdClient().equalsIgnoreCase(passportIdClient)) {
				listAccounts.add(i);
			}
		}
		return listAccounts;
	}
	
	//Сортировка всех счетов клиента 
	public List<Account> sortAccounts(Client client){
		List<Account> listAccounts = client.getAccounts();
		
		listAccounts.sort(new Comparator<Account>(){
			@Override
			public int compare(Account o1, Account o2) {
				if(o1.getAmountMoney() >= o2.getAmountMoney()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		return listAccounts;
	}
	
	//Сумма на всех счетах клиента
	public int sumAllOfAccounts(Client client){
		int sum = 0;
		List<Account> listAccounts = client.getAccounts();
		
		for(Account i: listAccounts) {
			if(!i.isStatusAccount()) {
				sum += i.getAmountMoney();
			}
		}
		return sum;
	}
	
	//Сумма на всех счетах клиента с положительным балансом
	public int sumAllOfPositiveAccounts(Client client){
		int sum = 0;
		List<Account> listAccounts = client.getAccounts();
		
		for(Account i: listAccounts) {
			if(i.getAmountMoney() > 0) {
				if(!i.isStatusAccount()) {
					sum += i.getAmountMoney();
				}
			}
		}
		return sum;
	}
	
	//Сумма на всех счетах клиента с отрицательным балансом
	public int sumAllOfNegativeAccounts(Client client){
		int sum = 0;
		List<Account> listAccounts = client.getAccounts();
		
		for(Account i: listAccounts) {
			if(i.getAmountMoney() < 0) {
				if(!i.isStatusAccount()) {
					sum += i.getAmountMoney();
				}
			}
		}
		return sum;
	}
	
}
