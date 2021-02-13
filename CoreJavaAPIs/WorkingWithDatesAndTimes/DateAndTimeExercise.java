
import java.time.*;
import java.util.*;

public class DateAndTimeExercise{
	public static void main(String... _1a1rray){
		System.out.println("LocalDate.now() is "+LocalDate.now());
		System.out.println("LocalTime.now() is "+LocalTime.now());
		System.out.println("LocalDateTime.now() is "+LocalDateTime.now());

		LocalDate dateOne = LocalDate.of(2015,Month.JANUARY,20);
		System.out.println("dateOne is "+dateOne);
		
		LocalTime localTimeOne = LocalTime.of(10,20);
		System.out.println("LocalTimeOne is "+localTimeOne);
	
		LocalDateTime localDateTimeOne = LocalDateTime.of(2021,1,2,3,4,5);
		System.out.println("localDateTimeOne is "+localDateTimeOne);

		//the date and time classes are immutable,just like String was

		Date date = new Date();
		System.out.println("Date is "+date);

		//LocalDate localDateTwo = LocalDate.of(); // no suitable method found for of(no arguments)

		LocalDate localDateThree = LocalDate.of(2077,Month.FEBRUARY,10);
		System.out.println("localDateThree is "+localDateThree);
		localDateThree = localDateThree.plusDays(1);
		System.out.println("localDateThree is "+localDateThree);
		localDateThree = localDateThree.plusWeeks(1);
		System.out.println("localDateThree is "+localDateThree);
		localDateThree = localDateThree.plusYears(1);
		System.out.println("localDateThree is "+localDateThree);
		localDateThree = localDateThree.plusMonths(1);
		System.out.println("localDateThree is "+localDateThree);


		LocalTime localTimeThree = LocalTime.of(23,10,10,999);
		System.out.println(localTimeThree);
		localTimeThree = localTimeThree.minusHours(1);	
		System.out.println(localTimeThree);
		localTimeThree = localTimeThree.minusMinutes(1);	
		System.out.println(localTimeThree);
		localTimeThree = localTimeThree.minusSeconds(1);	
		System.out.println(localTimeThree);
		localTimeThree = localTimeThree.minusNanos(1);	
		System.out.println(localTimeThree);


		LocalTime localTimeFour = LocalTime.of(10,20,30,40);
		System.out.println("localTimeFour is "+localTimeFour);
		localTimeFour = localTimeFour.minusHours(1).minusMinutes(1);
		System.out.println("localTimeFour is "+localTimeFour);
		

		LocalDate localDateFive = LocalDate.of(1997,2,20);
		System.out.println("localDateFive is "+localDateFive.toEpochDay());
	}
}