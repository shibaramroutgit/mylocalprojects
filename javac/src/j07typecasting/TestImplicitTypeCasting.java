package j07typecasting;

public class TestImplicitTypeCasting {
	
	static byte  age;
	static int Certificateage;
	static long adharage;
	static double officeage;
	
	public static void main(String[] args) {
		
		
		//Primitive Data Type
		//At this stage we are casting lower to higher data type
		officeage = adharage;
		adharage = Certificateage;
		Certificateage = age;
		
		
		
		//Derive Type
		//LocalTrain extends ExpressTrain extends RailwayStation
		//When we assigned super-class object in sub-class it called explicit casting 
		RailwayStation rw = new RailwayStation();
		ExpressTrain et = new ExpressTrain();
		LocalTrain lt = new  LocalTrain();
		et=(ExpressTrain)rw;
		lt = (LocalTrain)et;
		

	}

}
