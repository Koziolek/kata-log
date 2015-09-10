package pl.koziolekweb;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.TreeSet;

import static java.util.stream.Collectors.groupingBy;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class Bank {

	private final Collection<Client> clients;
	private final Collection<Account> accounts;

	public Bank() {
		clients = new TreeSet<>();
		accounts = new TreeSet<>();
	}

	public void newClient(Client client) {
		clients.add(client);
	}

	public Account registerNewAccountFor(Client client) {
		Account account = new Account(BigDecimal.ZERO, client);
		if (!client.isAdult()) throw new TooYoungClientException(client);
		client.registerAccount(account);
		accounts.add(account);
		return account;
	}

	public void reportFor(ReportType reportType) {
		System.out.println("-------------------------------------------");
		reportType.printReport(this);
		System.out.println("-------------------------------------------");
	}

	enum ReportType {
		CLIENT {
			@Override
			void printReport(Bank bank) {
				bank.accounts.stream()
						.collect(groupingBy(Account::getOwner))
						.entrySet().stream()
						.peek(e -> System.out.println(e.getKey()))
						.map(Entry::getValue)
						.flatMap(Collection::stream)
						.forEach(System.out::println);
			}
		}, ACCOUNT {
			@Override
			void printReport(Bank bank) {
				bank.accounts.stream().forEach(System.out::println);
			}
		};

		abstract void printReport(Bank bank);
	}
}
