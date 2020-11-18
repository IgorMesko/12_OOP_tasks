package by.htp.home.client;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Client> clients;
	
	public Bank(List<Client> clients) {
		this.clients = new ArrayList<>();
	}
	
	public void addNewClient(Client client) {
		clients.add(client);
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
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
		Bank other = (Bank) obj;
		if (clients == null) {
			if (other.clients != null)
				return false;
		} else if (!clients.equals(other.clients))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [clients=" + clients + "]";
	}
	
}
