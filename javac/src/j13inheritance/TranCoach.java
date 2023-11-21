package j13inheritance;

public class TranCoach extends Train{

	public static void main(String[] args) {
		// Static member are class level so we can call by sub- class or super class name (object is optional)
		System.out.println(TranCoach.tcoachcount);
		TranCoach.trainStatus();
	}

}
