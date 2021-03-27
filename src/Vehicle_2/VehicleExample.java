package Vehicle_2;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); 부모타입으로 만들어진 변수이기때문에 자식클래스에만있는 메소드는 호출불가능
		
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
		
		vehicle.run();  // 실행결과 : 버스가 달립니다. 
//		vehicle.checkFare();	// 실행안됨
		
	}

}
