package com.uday.dataandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class UdayDateTime {

	public static void main(String[] args) {

		/*LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
		System.out.println(tenthFeb2014);

		LocalDate firstAug2014 = LocalDate.of(2014, 8, 1);
		System.out.println(firstAug2014);

		LocalDate sixtyFifthDayOf2010 = LocalDate.ofYearDay(2010, 65);
		System.out.println(sixtyFifthDayOf2010);

		LocalDate threeSixtyDayOf1988 = LocalDate.ofYearDay(1988, 360);
		System.out.println(threeSixtyDayOf1988);

		LocalTime currentTimeInLosAngeles = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(currentTimeInLosAngeles);*/
		
		LocalDate a = LocalDate.of(2012, 6, 30);
		LocalDate b = LocalDate.of(2012, 7, 1);
		  System.out.println(a.isBefore(b) == true);

		
		LocalDate beforedate = LocalDate.of(2014, 2, 15); // 2014-06-15
		LocalDate afterdate = LocalDate.of(2017, 4, 30); // 2014-06-15
		boolean isBefore = beforedate.isBefore(afterdate); // false
		
		System.out.println(isBefore);


	}

}
