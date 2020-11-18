/*Счета. Клиент может иметь несколько счетов в банке. 
Учитывать возможность блокировки/разблокировки счета. 
Реализовать поиск и сортировку счетов. 
Вычисление общей суммы по счетам. 
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

package by.htp.home.client;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank(new ArrayList<>());
		Logic logic = new Logic();
		ViewLogic vl = new ViewLogic();
		
		Client client = new Client("Ivanov", "Petr", "Ivanovich", "MN2023645");
		client.addNewAccount(new Account(124412546, "BYN", 5000));
		client.addNewAccount(new Account(124235346, "BYN", -150));
		client.addNewAccount(new Account(110412259, "BYN", 10000));
		client.addNewAccount(new Account(124235346, "BYN", 2500));
		client.addNewAccount(new Account(124235346, "BYN", -350));
		
		Client client1 = new Client("Petrov", "Ivan", "Ivanovich", "MP1465873");
		client1.addNewAccount(new Account(110412254, "BYN", 250));
		client1.addNewAccount(new Account(124412546, "BYN", 300));
		
		bank.addNewClient(client);
		bank.addNewClient(client1);
		
		vl.printClients(logic.allClients(bank));
		vl.printSearchClients(logic.searchClients(bank, "MN2023645"), "MN2023645");
		vl.printAccountsClients(logic.searchAccounts(client, "MN2023645"), "MN2023645");
		vl.printSortAccountsClients(logic.sortAccounts(client), "MN2023645");
		vl.printSummMoney(client, "BYN");
		vl.printSummMoneyPositive(client, "BYN");
		vl.printSummMoneyNegative(client, "BYN");
	}
}
