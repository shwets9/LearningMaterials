package demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Demo5 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(1995, Month.MAY, 28, 1, 45);
		System.out.println(dt);

		System.out.println("six months after" + dt.plusMonths(6));
		System.out.println("2 months minus" + dt.minusMonths(2));

		LocalDate birthday = LocalDate.of(1989, 8, 28);
		LocalDate today = LocalDate.now();

		Period p = Period.between(birthday, today);
		System.out.printf("Age is %d year %d months %d days", p.getYears(), p.getMonths(), p.getDays());

	}

}
