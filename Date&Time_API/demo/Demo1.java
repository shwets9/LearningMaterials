package demo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Demo1 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);// default format

		LocalTime time = LocalTime.now();
		System.out.println(time);

	}

}
