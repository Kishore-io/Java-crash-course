package Java8Features;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateClass {

	public static void main(String[] args) throws ParseException {
		
// 		Previous Approach for Date and Time
		Date d=new Date();
		System.out.println(d);
				
		System.out.println(d.getMonth());
		System.out.println(d.getMonth()+1);
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date d1= sdf.parse("20-10-2022");
		
		System.out.println(d1);
	
		String dd=	sdf.format(d);
	
		System.out.println(dd);
		
		Date d2=sdf.parse(dd);
		
		
		System.out.println(d2.getDate());
	
		//-----------------------------------------
		
		System.out.println("---------");
//		New Approach using LocalDate
		
		LocalDate ld=LocalDate.now();
		
		
		System.out.println(ld);
		System.out.println(ld.getMonth());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.isLeapYear());
		
		//---------------------------------------
		
		LocalDate myLd=LocalDate.of(2024, 1, 20);
		
		System.out.println(myLd);
		System.out.println(myLd.getMonth());
		System.out.println(myLd.getMonthValue());
		
		System.out.println(myLd.isLeapYear());
		
		System.out.println("5 days after jan 20 "+myLd.plusDays(5));
		
		LocalDate myLd1=LocalDate.of(2024, 2, 27);
		System.out.println("2 days after feb 27 in a leap year "+myLd1.plusDays(2));


		LocalDate myLd2=LocalDate.of(2023, 2, 27);
		System.out.println("2 days after feb 27 in a non leap year "+myLd2.plusDays(2));

		
		LocalDate bookingDate=LocalDate.of(2022, 8, 20);
		LocalDate currentDate=LocalDate.now();
		
		
		if(bookingDate.isAfter(currentDate))
		{
			System.out.println("ur booking is accepted");
		}
		else
		{
			System.out.println("cannot book ticket for past dates");
		}
		
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		
		
	}

}


//localtime
//localDateTime
// zoneddatetime