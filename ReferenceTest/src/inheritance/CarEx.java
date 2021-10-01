package inheritance;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fireEngine = new FireEngine();
		Ambulance ambulance;
		
		//fireEngine = ambulance;
		Car car = fireEngine;
		FireEngine fireEngine2 = (FireEngine) car;
	}

}
