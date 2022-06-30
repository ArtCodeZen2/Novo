package application;

import java.util.Date;

import model.entities.DomainException;
import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws DomainException{
		// TODO Auto-generated method stub
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			int number = 1000;
			
			Date checkIn = sdf.parse("11/01/1997");		
			// out 
			
			Date checkOut = sdf.parse("20/01/1997");		
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
		    reservation.updateDates(sdf.parse("27/10/2020"), sdf.parse("30/10/2020"));	
		}catch(DomainException e) {
			System.out.println("Mensagem: " + e.getMessage());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("Error!");
		}
		
	}

}
