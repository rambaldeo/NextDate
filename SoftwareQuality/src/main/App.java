package main;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.text.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cont;
		do {
		Scanner scan = new Scanner(System.in);
		String input;
		int year,month, day;
		System.out.println("Enter the Day, Month, and Year in this format (XX/XX/XXXX)");
		input = scan.next();
		try {
		boolean val = Calendar.isValid(input);
		if(val == true) {
				String[] parts = input.split("/");
				month = Integer.parseInt(parts[1]);
				year = Integer.parseInt(parts[2]);
				if (1812 <= year && year <=2212) {
					if(1<= month && month<=12) {
						LocalDate findnextday = Calendar.nextday(input);
					}else {
						System.out.println("Sorry, you have not enter a month within the range");
					}
				}else {
					System.out.println("Sorry, you have not enter a year within the range");
				}
			}//val==true
		
		}catch(DateTimeParseException e) {
			System.out.println("You have entered a date outside of the range of that month");
		}
		System.out.println("Do you wish to enter another number? Y/N ");
		cont = scan.nextLine().toUpperCase();
		}while(cont.equals("Y"));
		System.out.println("Goodbye :)");
		
	}//public static void main
}//class app
