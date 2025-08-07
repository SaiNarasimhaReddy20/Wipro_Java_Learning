package com.java8features;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {
		//LocalDate
		LocalDate today=LocalDate.now();
		LocalDate nextweek=today.plusWeeks(1);
		System.out.println(today);
		System.out.println(nextweek);
		
		//Formatting
		DateTimeFormatter ft=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(today.format(ft));
		System.out.println(nextweek.format(ft));
		
	}

}
