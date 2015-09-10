package pl.koziolekweb;

import java.time.LocalDate;
import java.time.Period;

/**
 * User: koziolek
 */
public class Age {

	private final LocalDate birthDate;

	public static Age of(LocalDate birthDate) {
		return new Age(birthDate);
	}

	private Age(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getYears() {
		//return Period.between(birthDate, LocalDate.now()).getYears();
		return LocalDate.now().getYear() - birthDate.getYear();
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Age{");
		sb.append("birthDate=").append(birthDate);
		sb.append('}');
		return sb.toString();
	}

	public static Age of(int year, int month, int day) {
		return new Age(LocalDate.of(year, month, day));
	}
}
