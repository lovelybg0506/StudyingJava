package Vehicle;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vehicle = new Vehicle();
		
		vehicle.run();
		driver.drive(vehicle);
		
		driver.drive(taxi);
		driver.drive(bus);

	}

}
