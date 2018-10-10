package demo;

import java.time.LocalDateTime;

public class Demo4 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();
		System.out.println();
		System.out.printf("%d-%d-%d", dd, mm, yy);
		System.out.println();
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int ns = dt.getNano();
		System.out.printf("%d:%d:%d:%d", h, m, s, ns);
	}

}