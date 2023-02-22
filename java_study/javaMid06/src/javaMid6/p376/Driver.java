package javaMid6.p376;

public class Driver {
	
	void driver(Vehicle vehicle) {
		vehicle.run();
	}
	
	int fare(Vehicle vehicle) {
		int fare=0;
		if(vehicle instanceof Bus) {
			fare = 1350;
		}else if(vehicle instanceof Taxi) {
			fare = 3850;
		}else if(vehicle instanceof Subway) {
			fare = 1650;
		}return fare;
	}

}
