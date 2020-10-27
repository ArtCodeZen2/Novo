package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int number = 1000;
		
		Date checkIn = sdf.parse("11/01/1997");		
		// out 
		
		Date checkOut = sdf.parse("20/01/1997");
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation Check-out date must be after check-in date");
			
		}		
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);
			
			reservation.updateDates(sdf.parse("20/11/2020"), sdf.parse("21/11/2020"));
			System.out.println(reservation);
		}
	}

}
