package BusReservation;
import java.util.Scanner; //nested package/ hierarchical package

public class BusMain {

	public static void main(String[] args)  {
		
		BusDAO busdao = new BusDAO();
		try {
			busdao.displayBusInfo();
			
			int userOption = 1;
			Scanner scanner = new Scanner(System.in);
					
			while(userOption==1) {
				System.out.println("ENTER 1 TO BOOK BUS AND 2 TO EXIT FROM RESERVATION :");
				userOption = scanner.nextInt();
				if(userOption == 1) {
					BusBooking booking = new BusBooking();
					if(booking.isAvailable()) {
						BusBookingDAO bookingdao = new BusBookingDAO();
						bookingdao.addBooking(booking);
						System.out.println("BOOKING IS CONFIRMED");
					}
					else
						System.out.println("THIS BUS IS FULL , SO TRY ANOTHER BUS ");
				}
			}
			scanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
