package pl.koziolekweb;

import pl.koziolekweb.Bank.ReportType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * User: koziolek
 */
public class DebugKata2 {

	public static void main(String[] args) {
		// helper
		int y = LocalDate.now().minusYears(18).getYear();
		///
		Bank bank = new Bank();

		Client janKowalski = new Client("Jan", "Kowalski", Age.of(1980, 2, 21), new TreeSet<>());
		Client jerzyNowak = new Client("Jerzy", "Nowak", Age.of(1985, 4, 11), Collections.<Account>emptySet());
		bank.newClient(janKowalski);
		bank.newClient(jerzyNowak);

		Account janKowalskiAcc1 = bank.registerNewAccountFor(janKowalski);
		bank.registerNewAccountFor(jerzyNowak);
		bank.registerNewAccountFor(janKowalski);

		bank.reportFor(ReportType.CLIENT);

		janKowalskiAcc1.recognition(BigDecimal.TEN);

		bank.reportFor(ReportType.CLIENT);
	}
}
