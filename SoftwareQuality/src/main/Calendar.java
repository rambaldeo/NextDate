package main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.YearMonth;
public class Calendar {
	private static LocalDate nextdate;
	public static LocalDate nextday(String input) {
		// TODO Auto-generated method stub
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
		DateTimeFormatter readableformat = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		LocalDate date = LocalDate.parse(input, dateFormat);
		isValid(input);//checks the format
		//check if day entered is within the number of days in a month
			System.out.println("The inputted date is: " +readableformat.format(date)); //this takes the date and output in year-month-day
			FindNext(date);
			System.out.println("The next date is: " + readableformat.format(FindNext(date)));
			date = FindNext(date);
		return date;
	}
	static boolean isValid(String input) {
		boolean valid = false;
		SimpleDateFormat simpleform = new SimpleDateFormat("dd/MM/yyyy");
		try {
		Date inputdate = simpleform.parse(input);
		valid = true;
		}catch(ParseException e) {
			System.out.println("This is not the correct format");
			valid=false;
		}
		return valid;
	}
	public static LocalDate FindNext(LocalDate date2) {
		// TODO Auto-generated method stub
		date2= date2.plusDays(1);
		nextdate = date2;
		return nextdate;
	}

	
	
	

}
