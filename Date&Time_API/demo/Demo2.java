package demo;

import java.time.LocalDate;

public class Demo2 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("system format" + date);

		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();

		// output -02-08-2018
		System.out.printf("%d-%d-%d", dd, mm, yyyy);

	}

}
