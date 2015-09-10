package pl.koziolekweb;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * User: koziolek
 */
public class Account implements Comparable<Account>{

	private final UUID accountNumber;

	private final Client owner;

	private final BigDecimal balance;

	public Account(BigDecimal balance, Client owner) {
		this.accountNumber = UUID.randomUUID();
		this.balance = balance;
		this.owner = owner;
	}

	public Account recognition(BigDecimal value) {
		balance.add(value);
		return this;
	}

	public Account charge(BigDecimal value) {
		balance.subtract(value);
		return this;
	}

	public Client getOwner() {
		return owner;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Account{");
		sb.append("accountNumber=").append(accountNumber);
		sb.append(", owner=").append(owner);
		sb.append(", balance=").append(balance);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public int compareTo(Account o) {
		return accountNumber.compareTo(o.accountNumber);
	}
}
