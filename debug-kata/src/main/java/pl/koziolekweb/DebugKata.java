package pl.koziolekweb;

import pl.koziolekweb.Bank.ReportType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;

/**
 * User: koziolek
 */
public class DebugKata {

	public static void main(String[] args) {
		// helper
		int y = LocalDate.now().minusYears(18).getYear();
		///
		Bank bank = new Bank();

		Client janKowalski = new Client("Jan", "Kowalski", Age.of(1980, 2, 21), new HashSet<>());
		Client jerzyNowak = new Client("Jerzy", "Nowak", Age.of(1985, 4, 11), new HashSet<>());
		Client annaNabokowa = new Client("Anna", "Nabokowa", Age.of(y, 12, 31), new HashSet<>());
		bank.newClient(janKowalski);
		bank.newClient(jerzyNowak);
		bank.newClient(annaNabokowa);

		Account janKowalskiAcc1 = bank.registerNewAccountFor(janKowalski);
		bank.registerNewAccountFor(jerzyNowak);
		bank.registerNewAccountFor(janKowalski);
		bank.registerNewAccountFor(annaNabokowa);

		bank.reportFor(ReportType.CLIENT);

		janKowalskiAcc1.recognition(BigDecimal.TEN);

		bank.reportFor(ReportType.CLIENT);
	}
}
