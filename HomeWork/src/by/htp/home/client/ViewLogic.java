package by.htp.home.client;

import java.util.List;

public class ViewLogic {
	Logic logic = new Logic();
	
	public void printClients(List<Client> clients) {
		System.out.println("Список всех клиентов: ");
		
		for(Client i: clients) {
			System.out.println(i.getNameClient() + " " + i.getPatronymicClient() +" " + i.getSurnameClient() + ". Паспортные данные: " + i.getPassportIdClient());
		}
		System.out.println("-----------------------------------------------------");
	}
	
	public void printSearchClients(List<Client> clients, String passportIdClient) {
		System.out.println("Поиск по серии паспорта: " + passportIdClient);
		
		for(Client i: clients) {
			System.out.println("Найден клиент: " + i.getNameClient() + " " + i.getPatronymicClient() + " " + i.getSurnameClient());
		}
		System.out.println("-----------------------------------------------------");
	}
	
	public void printAccountsClients(List<Account> accounts, String passportIdClient) {
		System.out.println("Счета по серии паспорта: " + passportIdClient);
		
		for(Account i: accounts) {
			System.out.println("Номер счета: " + i.getAccountNumber() + ", сумма на счету: " + i.getAmountMoney() + " " 
		+ i.getCurrencyAccount());
		}
		System.out.println("-----------------------------------------------------");
	}
	
	public void printSortAccountsClients(List<Account> accounts, String passportIdClient) {
		System.out.println("Счета по серии паспорта: " + passportIdClient + ", " + "отсортированные по сумме: ");
		
		for(Account i: accounts) {
			System.out.println("Номер счета: " + i.getAccountNumber() + ", сумма на счету: " + i.getAmountMoney() + " " 
		+ i.getCurrencyAccount());
		}
		System.out.println("-----------------------------------------------------");
	}
	
	public void printSummMoney(Client client, String currencyAccount) {
		System.out.println("Общая сумма денег на всех счетах: " + logic.sumAllOfAccounts(client) + " " + currencyAccount);
		System.out.println("-----------------------------------------------------");
	}

	public void printSummMoneyPositive(Client client, String currencyAccount) {
		System.out.println("Общая сумма денег на счетах c положительным балансом: " + logic.sumAllOfPositiveAccounts(client) + " " + currencyAccount);
		System.out.println("-----------------------------------------------------");
	}
	
	public void printSummMoneyNegative(Client client, String currencyAccount) {
		System.out.println("Общая сумма денег на счетах c отрицательным балансом: " + logic.sumAllOfNegativeAccounts(client) + " " + currencyAccount);
		System.out.println("-----------------------------------------------------");
	}
	
}
