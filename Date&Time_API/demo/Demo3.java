package demo;

import java.time.LocalTime;

public class Demo3 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();

		// get hours
		int hr = time.getHour();

		// get minutes
		int minutes = time.getMinute();

		// get seconds
		int seconds = time.getSecond();

		// get nano seconds
		int nanoseconds = time.getNano();

		System.out.printf("%d:%d:%d:%d", hr, minutes, seconds, nanoseconds);

	}

}
