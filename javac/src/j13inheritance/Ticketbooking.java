package j13inheritance;

public class Ticketbooking extends Pasanger{

	public static void main(String[] args) {
		// Non Static member are object level so we can call sub-class or super call object
		Ticketbooking t1 = new Ticketbooking();
		System.out.println(t1.tnum);
		t1.ticketBooking();
		
	}

}
