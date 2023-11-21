package j07typecasting;

public class TestExplicitTypeCasting {
	
	static int Certificateage;
	static long adharage;
	static double officeage;
	
	public static void main(String[] args) {
		
		//Primitive Type 
		//At this stage by define the type we are casting higher to lower data type
		Certificateage=(int)adharage;
		adharage=(long)officeage;
		
		
		//Derive Type
		//LocalTrain extends ExpressTrain extends RailwayStation
		//When we assigned sub-class object it super class it called implicit casting 
		RailwayStation rw = new RailwayStation();
		ExpressTrain et = new ExpressTrain();
		LocalTrain lt = new  LocalTrain();
		rw=et;
		et=lt;
		
		


		

	}

}
