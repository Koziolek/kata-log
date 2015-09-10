package pl.koziolekweb;

import java.util.Collection;

/**
 * User: koziolek
 */
public class Client implements Comparable<Client> {

	private final String firstName;

	private final String lastName;

	private final Age age;

	private Collection<Account> accounts;

	public Client(String firstName, String lastName, Age age, Collection<Account> accounts) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.accounts = accounts;
	}

	public boolean registerAccount(Account account) {
		return accounts.add(account);
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Client{");
		sb.append("firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", age=").append(age);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public int compareTo(Client o) {
		return (firstName + lastName).compareTo(o.firstName + o.lastName);
	}

	public boolean isAdult() {
		return age.getYears() >= 18;
	}
}
