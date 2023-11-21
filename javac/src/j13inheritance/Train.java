package j13inheritance;

public class Train {
	
	int tnum =1234;
	static int tcoachcount = 10;
	
	public static void trainStatus()
	{
		System.out.println("Train on Time - Static Method");
	}
	
	public  void ticketBooking()
	{
		System.out.println("Train Ticket Booking - Non Static Method");
	}

	public static void main(String[] args) {
		

	}

}
