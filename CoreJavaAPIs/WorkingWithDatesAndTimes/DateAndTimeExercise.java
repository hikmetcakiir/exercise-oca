
import java.time.*;
import java.time.format.*;
import java.util.Date;

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

		System.out.println();

		LocalDate dateEight = LocalDate.of(2015,1,20);
		LocalTime timeEight = LocalTime.of(6,15);
		LocalDateTime dateTimeEight = LocalDateTime.of(dateEight,timeEight);
		Period periodEight = Period.ofMonths(1);
		System.out.println(dateEight.plus(periodEight)); //2015-02-20		
		System.out.println(dateTimeEight.plus(periodEight)); //2015-02-20T06:15

		System.out.println();
		LocalDate dateNine = LocalDate.of(2020,Month.JANUARY,20);
		System.out.println(dateNine.getDayOfWeek()); //MONDAY
		System.out.println(dateNine.getMonth()); //JANUARY
		System.out.println(dateNine.getYear()); //2020
		System.out.println(dateNine.getDayOfYear()); //20


		LocalDate dateTen = LocalDate.of(2020,Month.JANUARY,20);
		LocalTime timeTen = LocalTime.of(11,12,34);
		LocalDateTime dateTimeTen = LocalDateTime.of(dateTen,timeTen);
	 	System.out.println(dateTen.format(DateTimeFormatter.ISO_LOCAL_DATE));
	}
}